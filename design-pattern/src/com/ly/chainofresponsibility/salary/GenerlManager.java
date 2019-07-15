package com.ly.chainofresponsibility.salary;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.salary
 * @ClassName: CommonManager
 * @Author: lin
 * @Description: 设置总经理权限
 * @Date: 2019-07-15 11:07
 * @Version: 1.0
 */
public class GenerlManager extends Manager {

    public GenerlManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "被批准");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "不批准");
        } else {
            System.out.println("权限不健全，功能超出");
        }
    }
}
