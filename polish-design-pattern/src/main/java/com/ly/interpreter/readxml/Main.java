package com.ly.interpreter.readxml;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用解释器模式读取XML
 *               ( /  表示还有下级)
 *               获取单个元素的值 root/a/b/c
 *               获取单个元素的属性值 root/a/b/c.name
 *               ( $ 表示获取多个)
 *               获取多个元素的值 root/a/b/c$
 *               获取多个元素的属性的值 root/a/b/c$.name$
 * @Date: 2019-08-15 11:06
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 首先创建上下文对象
        Content content = new Content ("/interpreter/InterpreterText.xml");
        // 获取 root/a/b/c 元素的值
        // 构建解释器的抽象语法树
        ElementExpression root = new ElementExpression ("root");
        ElementExpression a = new ElementExpression ("a");
        ElementExpression b = new ElementExpression ("b");
        ElementTerminalExpression c = new ElementTerminalExpression ("c");
        // 组合抽象语法树
        root.addEle (a);
        a.addEle (b);
        b.addEle (c);

        // 调用
        String[] strings = root.interpret (content);
        System.out.println (" c 的值是："+strings[0]);


        // 获取 root/a/b/c.name 元素的值
        // 构建解释器的抽象语法树
        ElementExpression cs = new ElementExpression ("c");
        PropertyTerminalExpression name = new PropertyTerminalExpression ("name");
        // 组合抽象语法树
        b.remove (c);
        b.addEle (cs);
        cs.addEle (name);

        // 使用同一上下文对象需要重新初始化
        content.reInit ();


        // 调用
        strings = root.interpret (content);
        System.out.println (" c 的属性 name 的值是："+strings[0]);
    }
}
