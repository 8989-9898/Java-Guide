package com.ly.command.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.command
 * @ClassName: Main
 * @Author: lin
 * @Description: 调用某种功能，有它内部执行具体的命令
 * @Date: 2019/8/3 9:28
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.assemble();
    }

    /**
     * 命令模式的优点
     *      更松散耦合：命令模式使得发起命令的对象--客户端，和具体实现的对象--接受者对象完全解耦，也就是说发起
     *      命令的客户端完全不知道具体的实现对象是谁，也不知道如何实现。
     *
     *      更动态的控制：命令模式把请求封装起来，可以动态对他们进行参数化、队列化和日志化等操作，从而使得系统更灵活。
     *
     *      很自然的复合命令： 命令模式中的命令对象可以很容易的组合成复合命令，也就是宏命令。从而是系统操作更简单，功能
     *      更强大。
     *
     *      更好的扩展性：由于发起命令的对象和具体的实现完全解耦，因此扩展新的命令就很容易，只需要实现新的命令对象
     *      ，然后在装配的时候，把具体的实现对象设置到命令对象中，然后就可以使用这个命令对象，已有的实现完全不用变化。
     *
     * 命令模式的本质是：分装请求
     *
     *
     * */
}
