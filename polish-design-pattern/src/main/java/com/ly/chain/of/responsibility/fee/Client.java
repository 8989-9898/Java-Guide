package com.ly.chain.of.responsibility.fee;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用责任链模式的客户端
 *               该种方式有一个问题，就是每次添加一种功能就需要修改所有的责任处理类添加相应的责任处理方法
 *               如：添加申请差旅费的功能
 * @Date: 2019-08-16 13:01
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Handler project=new ProjectManager ();
        Handler dept=new DeptManager ();
        Handler general=new GeneralManager ();
        // 组装责任链
        project.setSuccessor (dept);
        dept.setSuccessor (general);

        String mi = project.handlerFeeRequest ("小米", 300);
        System.out.println (mi);
        String hong = project.handlerFeeRequest ("小红", 300);
        System.out.println (hong);

        mi = project.handlerFeeRequest ("小米", 900);
        System.out.println (mi);
        hong = project.handlerFeeRequest ("小红", 900);
        System.out.println (hong);

        mi = project.handlerFeeRequest ("小米", 3000);
        System.out.println (mi);
        hong = project.handlerFeeRequest ("小红", 3000);
        System.out.println (hong);



        /*            后添加的申请差旅费的功能              */
        project.handlerPreFeeRequest ("小红", 3000);
        project.handlerPreFeeRequest ("小红", 12000);
        project.handlerPreFeeRequest ("小红", 33000);
    }
}
