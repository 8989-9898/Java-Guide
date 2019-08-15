package com.ly.interpreter.multiple;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ElementExpression
 * @Author: lin
 * @Description: 多个元素作为非终止符对应的解释器，解释并执行中间的元素
 * @Date: 2019-08-15 11:11
 * @Version: 1.0
 */
public class ElementsExpression extends ReadXmlExpression {

    /**
     * 用来记录组合的 ReadXmlExpression 元素
     */
    private List<ReadXmlExpression> eles = new ArrayList<> ();

    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementsExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        eles.add (ele);
        return true;
    }

    public boolean remove(ReadXmlExpression ele) {
        eles.remove (ele);
        return true;
    }

    @Override
    public String[] interpret(Content content) {
        // 先取出上下文中父元素
        List<Element> preEle = content.getPreEle ();
        // 把当前获取的元素放入到上下文中，获取的是多个元素
        List<Element> elements = new ArrayList<> ();
        preEle.forEach (e -> elements.addAll (content.getNowEle (e, this.eleName)));
        content.setPreEle (elements);
        String[] strs = null;
        // 循环调用子元素的 Interpret 方法
        for (ReadXmlExpression read : eles) {
            strs = read.interpret (content);
        }
        return strs;
    }
}
