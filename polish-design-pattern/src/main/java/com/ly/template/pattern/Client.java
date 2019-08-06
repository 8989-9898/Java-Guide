package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用模板方法的登录控制
 * @Date: 2019-08-06 16:46
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LoginModel model = new LoginModel();
        model.setPwd("administrator");
        model.setLoginId("admin");
        NormalLogin normalLogin = new NormalLogin();
        WorkerLogin workerLogin = new WorkerLogin();

        System.out.println("可以进行工作人员的登录："+workerLogin.login(model));
        System.out.println("可以进行普通人员的登录："+normalLogin.login(model));
    }
}
