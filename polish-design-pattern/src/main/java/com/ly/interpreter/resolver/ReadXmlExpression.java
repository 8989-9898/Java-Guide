package com.ly.interpreter.resolver;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ReadXmlExpression
 * @Author: lin
 * @Description: 用于处理自定义 XML 取值表达式的接口
 * @Date: 2019-08-15 10:47
 * @Version: 1.0
 */
public abstract class ReadXmlExpression {

    public  abstract String[] interpret(Content content);
}
