package com.ly.chainofresponsibility.responsibility;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.responsibility
 * @ClassName: ConcreteHandler1
 * @Author: lin
 * @Description: 具体的处理这类，只能处理10到20之间的数，否则转到下一位
 * @Date: 2019-07-15 10:53
 * @Version: 1.0
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request > 10 && request < 20) {
            System.out.println(this.getClass().getSimpleName() + " 处理请求参数： " + request);
        } else if (successer != null) {
            successer.handlerRequest(request);
        }
    }
}
