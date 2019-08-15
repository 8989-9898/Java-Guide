package com.ly.interpreter.readxml;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: PropertyTerminalExpression
 * @Author: lin
 * @Description: 属性作为终止符对应的解释器
 * @Date: 2019-08-15 13:09
 * @Version: 1.0
 */
public class PropertyTerminalExpression extends ReadXmlExpression {
    /**
     * 属性的名字
     */
    private String propName="";

    public PropertyTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Content content) {
        // 直接获取最后的元素属性的值
        String[] strs=new String[1];
        strs[0]=content.getPreEle ().getAttribute (this.propName);
        return strs;
    }
}
