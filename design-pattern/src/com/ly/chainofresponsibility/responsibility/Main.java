package com.ly.chainofresponsibility.responsibility;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.responsibility
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-15 10:57
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        // 设置责任链的上家和下家
        handler1.setSuccesser(handler2);
        handler2.setSuccesser(handler3);
        int[] requests = {12, 5, 24, 2, 2, 27, 15, 26};
        for (int request : requests) {
            handler1.handlerRequest(request);
        }
    }
}
