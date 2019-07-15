package com.ly.chainofresponsibility.salary;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.salary
 * @ClassName: CommonManager
 * @Author: lin
 * @Description: 设置总监权限
 * @Date: 2019-07-15 11:07
 * @Version: 1.0
 */
public class MajordomoManager extends Manager {

    public MajordomoManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(name+":"+request.getRequestContent()+" 数量："+request.getNumber()+"被批准");
        }else if (superior!=null){
            superior.requestApplication(request);
        }
    }
}
