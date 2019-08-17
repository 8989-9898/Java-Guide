package com.ly.visitor.customer;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.customer
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用访问者模式的客户分析系统功能实现
 * @Date: 2019/8/17 15:12
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        Customer A = new EnterPriseCustomer();
        A.setName("A企业");
        structure.addElement(A);
        Customer B = new EnterPriseCustomer();
        B.setName("B企业");
        structure.addElement(B);
        Customer person = new PersonalCustomer();
        person.setName("个人客户");
        structure.addElement(person);

        System.out.println("客户提出服务，传入服务请求的 Visitor");
        structure.handleRequest(new ServiceRequestVisitor());
        System.out.println("客户偏好分析，传入偏好分析的 Visitor");
        structure.handleRequest(new PredilectionAnalyzeVisitor());
        System.out.println("(新添加的功能实现：)客户价值分析，传入价值分析的 Visitor");
        structure.handleRequest(new WorthAnalyzeVisitor());

    }
}
