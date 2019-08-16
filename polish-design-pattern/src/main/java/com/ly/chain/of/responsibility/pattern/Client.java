package com.ly.chain.of.responsibility.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 责任链的客户端，向链上的具体处理对象提交请求，让责任链负责处理
 * @Date: 2019-08-16 11:06
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建责任处理对象
        Handler a = new ConcreteHandlerA ();
        Handler b = new ConcreteHandlerB ();
        // 组装责任链
        a.setSuccessor (b);

        // 开始请求
        a.handleRequest ();
    }

    /**
     * 责任链模式的优点：
     *      请求者和接收者松散耦合：在责任链模式中，请求者并不知道接受者是谁，也不知道具体如何处理，请求者只是负责向责任链发出请求就可以了。
     *      而每个责任对象也不用管请求者或者是其它的职责对象，只负责处理自己的部分，其他的就交给其它的职责对象去处理。也就是收请求者和接受
     *      者是完全解耦合的。
     *      动态组合职责：责任链模式会把功能处理分散到单独的职责对象中，然后在使用的时候，可以动态组合责任形成责任链，从而可以灵活的给对象
     *      分配责任，也可以灵活的实现和改变对象的责任
     *
     * 责任链模式的缺点：
     *      产生很多细粒度对象：责任链模式会把功能处理分散到单独的职责对象中，也就是每个责任对象只会处理一个方面的功能，要把整个业务处理完，
     *      需要很多的责任对象组合，这样会产生大量的细粒度的责任对象。
     *      不一定能被处理：责任链模式的每个责任对象只负责处理自己的那一部分，因此可能会出现某个请求，把整个链传递完了。都没有责任对象处理
     *      他，这就需要在使用责任链模式的时候，需要提供默认的处理，并且注意构建的链是有效的。
     *
     * 责任链模式的本质是：分离职责，动态组合。
     *
     * */
}
