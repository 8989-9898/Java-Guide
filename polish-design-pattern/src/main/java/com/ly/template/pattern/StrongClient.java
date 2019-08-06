package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: StrongClient
 * @Author: lin
 * @Description: 测试加强版的普通用户登录
 * @Date: 2019-08-06 17:14
 * @Version: 1.0
 */
public class StrongClient {
    public static void main(String[] args) {
        NormalLoginModel model = new NormalLoginModel();
        model.setLoginId("userId");
        model.setPwd("users");
        model.setQuestion("testQuestion");
        model.setAnswer("testAnswer");
        NormalLogin2 login2 = new NormalLogin2();
        boolean login = login2.login(model);
        System.out.println("普通用户是否登录成功==>"+login);
    }
}
