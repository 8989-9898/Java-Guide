package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用一个方法处理不同的请求，解决每次添加功能是需要修改所有责任链方法的问题
 *              这种方式会造成对象层次过多，同时会出先大量只处理一个功能的细粒度对象。
 * @Date: 2019-08-16 13:32
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Handler project = new ProjectManager2 ();
        Handler dept = new DeptManager2 ();
        Handler general = new GeneralManager2 ();
        // 组装责任链
        project.setSuccessor (dept);
        dept.setSuccessor (general);

        FeeRequestModel model = new FeeRequestModel ("小米", 400);
        Object str = project.handlerRequest (model);
        System.out.println (str);
        model.setFee (600);
        str = project.handlerRequest (model);
        System.out.println (str);
        model.setFee (6000);
        str = project.handlerRequest (model);
        System.out.println (str);

        PreFeeRequestModel model1 = new PreFeeRequestModel ("小米",4000.0);
        str = project.handlerRequest (model1);
        System.out.println (str);
        model1.setPreFee (6000);
        str = project.handlerRequest (model1);
        System.out.println (str);
        model1.setPreFee (60000);
        str = project.handlerRequest (model1);
        System.out.println (str);
    }
}
