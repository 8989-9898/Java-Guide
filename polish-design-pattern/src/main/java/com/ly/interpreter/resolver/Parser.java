package com.ly.interpreter.resolver;

import com.ly.singleton.singleton.Singleton;

import java.util.*;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.resolver
 * @ClassName: Parser
 * @Author: lin
 * @Description: 根据语法来解析表达式，转换成为相应的抽象语法树
 * @Date: 2019-08-15 14:18
 * @Version: 1.0
 */
public class Parser {

    private Parser() {
    }

    /**
     * 定义常量内部使用
     */
    private final static String BACKLASH = "/";
    /**
     * 定义常量内部使用
     */
    private final static String DOT = ".";
    /**
     * 定义常量内部使用
     */
    private final static String DOLLAR = "$";

    /**
     * 按照分解的先后记录需要解析的元素的名称
     */
    private static List<String> list = null;


    /**
     * 传入一个字符表达式，通过解析，组合成为一个抽象的语法树
     *
     * @param expr 字符表达式
     * @return 对应的抽象语法树
     */
    public static ReadXmlExpression parse(String expr) {
        // 先初始化记录需解析的元素名称的集合
        list = new ArrayList<> ();
        // 第一步：分解表达式，得到需要解析的元素名称和该元素对应的解析模型
        Map<String, ParserModel> map = parseMapPath (expr);
        // 第二步：根据相应的节点属性转换为相应的解释器对象
        List<ReadXmlExpression> reads = mapPath2Interpreter (map);
        //第三步：组合对象语法树
        ReadXmlExpression trees = buildTree (reads);
        return trees;
    }

    /**
     * 按照从左到右的顺序解析表达式，得到需要解析的元素名称和该元素对应的解析模型
     *
     * @param expr 需要的表达式
     * @return 得到需要解析的元素名称，还有该元素对应的解析模型
     */
    private static Map<String, ParserModel> parseMapPath(String expr) {
        // 按照 / 分割表达式
        StringTokenizer tokenizer = new StringTokenizer (expr, BACKLASH);
        Map<String, ParserModel> map = new HashMap<> ();
        while (tokenizer.hasMoreTokens ()) {
            String onePath = tokenizer.nextToken ();

            if (tokenizer.hasMoreTokens ()) {
                // 还有下一个值，说明这不是最后一个元素
                // 按照现在的语法，属性必然在最后，因此也不是属性
                setParsePath (false, onePath, false, map);
            } else {
                // 说明到最后一个了
                int index = onePath.indexOf (DOT);
                if (index > 0) {
                    // 说明需要获取属性，使用 '.' 来分割，前面是元素名，后面是属性名
                    String eleName = onePath.substring (0, index);
                    String propName = onePath.substring (index + 1);
                    // 设置属性前面的那个元素，自然不是最后一个，也不是属性
                    setParsePath (false, eleName, false, map);
                    // 设置属性，现在的语法定义，属性自能是最后一个
                    setParsePath (true, propName, true, map);
                } else {
                    // 说明取元素值而且是最后一个
                    setParsePath (true, onePath, false, map);
                }
            }
        }
        return map;
    }

    /**
     * 按照分解出来的位置和名称来设置需要解析的元素名称
     *
     * @param end           是否是终止符
     * @param ele           元素名称
     * @param propertyValue 是否是属性
     * @param map           设置需要解析的元素名称和该元素对应的解析模型
     */
    private static void setParsePath(boolean end, String ele, boolean propertyValue, Map<String, ParserModel> map) {
        // 有 $ 表示是多个值
        ParserModel model = new ParserModel (!(ele.indexOf (DOLLAR) > 0), propertyValue, end);
        ele = ele.replace (DOLLAR, "");
        list.add (ele);
        map.put (ele, model);
    }

    /**
     * 把分解出来的元素名称根据对应的解析模型转换为相应的解释器对象
     *
     * @param map 分解出来需要解析的元素名称和该元素对应的解析模型
     * @return 把每个元素转换成为相应的解释器对象后和集合
     */
    private static List<ReadXmlExpression> mapPath2Interpreter(Map<String, ParserModel> map) {
        List<ReadXmlExpression> reads = new ArrayList<> ();
        // 安装先后顺序来转换成为解释器对象
        for (String key : list) {
            ParserModel model = map.get (key);
            ReadXmlExpression expression = null;
            if (!model.isEnd ()) {
                // 不是最后一个
                if (model.isSingleValue ()) {
                    // 是一个值
                    expression = new ElementExpression (key);
                } else {
                    // 多个值
                    expression = new ElementsExpression (key);
                }
            } else {
                // 是最后一个
                if (model.isPropertyValue ()) {
                    // 是属性
                    if (model.isSingleValue ()) {
                        // 是一个值
                        expression = new PropertyTerminalExpression (key);
                    } else {
                        // 多个值
                        expression = new PropertysTerminalExpression (key);
                    }
                } else {
                    // 是元素
                    if (model.isSingleValue ()) {
                        // 是一个值
                        expression = new ElementTerminalExpression (key);
                    } else {
                        // 多个值
                        expression = new ElementsTerminalExpression (key);
                    }
                }
            }
            reads.add (expression);
        }
        return reads;
    }


    /**
     * 构建抽象语法树
     *
     * @param list 构建语法树需要的元素
     * @return 抽象语法树
     */
    private static ReadXmlExpression buildTree(List<ReadXmlExpression> list) {
        //  第一个对象，也就是根对象，
        ReadXmlExpression root = null;
        // 定义上一个对象
        ReadXmlExpression previous = null;

        for (ReadXmlExpression expression : list) {
            if (previous == null) {
                // 说明是第一个对象
                root = expression;
                previous = expression;
            } else {
                // 把元素添加到上一个对象下面，同时把本对象设置成为 Old
                // 作为下一个对象的父节点
                if (previous instanceof ElementExpression) {
                    ElementExpression element = (ElementExpression) previous;
                    element.addEle (expression);
                    previous = expression;
                } else if (previous instanceof ElementsExpression) {
                    ElementsExpression eles = (ElementsExpression) previous;
                    eles.addEle (expression);
                    previous = expression;
                }
            }
        }
        return root;
    }
}
