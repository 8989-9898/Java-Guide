package com.ly.interpreter.multiple;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用解释器模式读取XML
 * ( /  表示还有下级)
 * 获取单个元素的值 root/a/b/c
 * 获取单个元素的属性值 root/a/b/c.name
 * ( $ 表示获取多个)
 * 获取多个元素的值 root/a/b/c$
 * 获取多个元素的属性的值 root/a/b/c$.name$
 * @Date: 2019-08-15 11:06
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 首先创建上下文对象
        Content content = new Content ("/interpreter/InterpreterText.xml");
        // 获取 root/a/b/d$ 元素的值
        // 构建解释器的抽象语法树
        ElementExpression root = new ElementExpression ("root");
        ElementExpression a = new ElementExpression ("a");
        ElementExpression b = new ElementExpression ("b");
        ElementsTerminalExpression ds = new ElementsTerminalExpression ("d");
        // 组合抽象语法树
        root.addEle (a);
        a.addEle (b);
        b.addEle (ds);

        // 调用
        String[] strings = root.interpret (content);
        for (String string : strings) {
            System.out.println (" d 的值是：" + string);
        }


        // 获取 root/a/b/d$.id$ 元素的值
        // 构建解释器的抽象语法树
        ElementsExpression dss = new ElementsExpression ("d");
        PropertysTerminalExpression id = new PropertysTerminalExpression ("id");
        // 组合抽象语法树
        b.remove (ds);
        b.addEle (dss);
        dss.addEle (id);

        // 使用同一上下文对象需要重新初始化
        content.reInit ();
        // 调用
        strings = root.interpret (content);
        for (String string : strings) {
            System.out.println (" d 的属性 id 的值是：" + string);
        }
    }

    /**
     * 解释器模式的优点
     *      易于实现语法：在解释器模式中，一条语法规则运用一个解释器对象类解释执行。对于解释器的实现来讲，功能就变得比较
     *      简单，只需要考虑这一条语法规则的实现就可以了，其他的都不用管。
     *      易于扩展新的语法：正是采用一个解释器对应一条语法的规则的方式，使得扩展新的语法非常的容易。扩展新的语法只要扩
     *      展解释器的对象，在创建抽象语法树的时候使用这个新的解释器对象就可以了。
     *
     * 解释器模式的缺点：
     *      不适合复杂的语法：如果语法特别的复杂，构建解释器模式需要的抽象语法树的工作是非常的艰巨的，在加上有可能需要构
     *      建多个抽象语法树。所以解释器模式不太适合于复杂的语法，对于复杂的语法，使用语法分析程序或编译器生成器可能会更
     *      好一点。
     *
     *
     * 解释器模式的本质是：分离实现，解释执行。
     * */

}
