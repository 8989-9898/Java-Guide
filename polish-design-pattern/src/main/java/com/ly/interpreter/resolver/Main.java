package com.ly.interpreter.resolver;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用解释器模式读取XML,结合解析器
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
        // 通过解析器获取抽象语法树
        ReadXmlExpression tree = Parser.parse ("root/a/b/d$.id$");
        // 请求解析，获取结果
        String[] strings = tree.interpret (content);
        for (String string : strings) {
            System.out.println (" d 的属性 id 的值是："+string);
        }

        // 使用同一上下文对象需要重新初始化
        content.reInit ();

        // 通过解析器获取抽象语法树
        ReadXmlExpression tree2 = Parser.parse ("root/a/b/d$");
        // 调用
        strings = tree2.interpret (content);
        for (String string : strings) {
            System.out.println (" d 的值是："+string);
        }
    }
}
