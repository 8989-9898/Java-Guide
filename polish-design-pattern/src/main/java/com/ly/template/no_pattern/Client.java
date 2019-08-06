package com.ly.template.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试不使用模式时的不同登录请求
 *              基本一样的登录需要,写两遍很不方便，同时也不宜与扩展，如需要在登录上添加一个功能就要修改两个地方
 * @Date: 2019-08-06 16:17
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("普通用户进行登录---------------------------------->");
        UserLoginModel loginModel = new UserLoginModel();
        loginModel.setUserId("user0001");
        loginModel.setPwd("zhangsan");
        NormalLogin normalLogin = new NormalLogin();
        boolean login = normalLogin.login(loginModel);
        System.out.println("普通用户登录==》"+login);
        System.out.println("工作人员进行登录---------------------------------->");
        WorkerLoginModel model = new WorkerLoginModel();
        model.setWorkerId("user0001");
        model.setPwd("administrator");
        WorkerLogin workerLogin = new WorkerLogin();
        login = workerLogin.login(model);
        System.out.println("工作人员登录==》"+login);

    }
}
