package com.ly.interpreter.multiple;

import org.w3c.dom.Element;

import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: PropertyTerminalExpression
 * @Author: lin
 * @Description: 以多个元素的属性作为终止符对应的解释器
 * @Date: 2019-08-15 13:09
 * @Version: 1.0
 */
public class PropertysTerminalExpression extends ReadXmlExpression {
    /**
     * 属性的名字
     */
    private String propName="";

    public PropertysTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Content content) {
        // 直接获取最后的多个元素
        List<Element> preEle = content.getPreEle ();
        String[] strs=new String[preEle.size ()];
        // 循环多个元素，获取每个元素属性的值
        for (int i = 0; i < strs.length; i++) {
            strs[i]=content.getPreEle ().get (i).getAttribute (this.propName);
        }
        return strs;
    }
}
