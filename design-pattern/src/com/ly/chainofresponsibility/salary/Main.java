package com.ly.chainofresponsibility.salary;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.salary
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-15 11:16
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Manager commonManager = new CommonManager("经理张三");
        Manager majordomoManager = new MajordomoManager("总监里斯");
        Manager generlManager = new GenerlManager("总经理王五");
        commonManager.setSuperior(majordomoManager);
        majordomoManager.setSuperior(generlManager);


        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小蔡不想上班了");
        request.setNumber(1);
        commonManager.requestApplication(request);

        request.setRequestType("请假");
        request.setRequestContent("小李不想上班了");
        request.setNumber(4);
        commonManager.requestApplication(request);

        request.setRequestType("请假");
        request.setRequestContent("老张不想上班了");
        request.setNumber(10);
        commonManager.requestApplication(request);


        request.setRequestType("加薪");
        request.setRequestContent("老张想加工资");
        request.setNumber(400);
        commonManager.requestApplication(request);


        request.setRequestType("加薪");
        request.setRequestContent("老张想加工资");
        request.setNumber(600);
        commonManager.requestApplication(request);



    }
}
