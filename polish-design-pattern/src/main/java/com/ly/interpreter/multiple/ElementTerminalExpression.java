package com.ly.interpreter.multiple;

import org.w3c.dom.Element;

import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ElementTerminalExpression
 * @Author: lin
 * @Description: 元素作为终止符对应的解释器
 * @Date: 2019-08-15 11:27
 * @Version: 1.0
 */
public class ElementTerminalExpression extends ReadXmlExpression {

    /**
     * 元素的名字
     */
    private String eleName = "";

    public ElementTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Content content) {
        // 先取出上下文中的当前元素作为父元素
        List<Element> preEle = content.getPreEle ();
        // 找到当前元素名称所对应的 xml 元素
        Element ele=null;
        if (preEle.size () == 0) {
            // 说明当前元素是根元素
            ele=content.getDocument ().getDocumentElement ();
        } else {
            // 获取当前的元素
            ele = content.getNowEle (preEle.get (0),eleName).get (0);
        }
        String[] strs = new String[1];
        strs[0] = ele.getFirstChild ().getNodeValue ();
        return strs;
    }
}
