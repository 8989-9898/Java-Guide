package com.ly.interpreter.resolver;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ElementTerminalExpression
 * @Author: lin
 * @Description: 以多个元素作为终止符对应的解释器
 * @Date: 2019-08-15 11:27
 * @Version: 1.0
 */
public class ElementsTerminalExpression extends ReadXmlExpression {

    /**
     * 元素的名字
     */
    private String eleName = "";

    public ElementsTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Content content) {
        // 先取出上下文中的当前元素作为父元素
        List<Element> preEle = content.getPreEle ();
        // 获取当前的多个元素
        List<Element> elements = new ArrayList<> ();
        preEle.forEach ((e) -> {
            elements.addAll (content.getNowEle (e, this.eleName));
        });
        // 获取这些元素的值
        String[] strs = new String[elements.size ()];
        for (int i = 0; i < strs.length; i++) {
            strs[i]=elements.get (i).getFirstChild ().getNodeValue ();
        }
        return strs;
    }
}
