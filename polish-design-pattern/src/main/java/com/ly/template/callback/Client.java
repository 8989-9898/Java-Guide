package com.ly.template.callback;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.template.callback
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用回调的方式实现和模板方法模式一样的功能
 * @Date: 2019/8/6 20:50
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LoginModel model = new LoginModel();
        model.setPwd("pwd");
        model.setLoginId("user");

        LoginTemplate userLogin = new LoginTemplate();

        boolean login = userLogin.login(model, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel model = new LoginModel();
                model.setPwd("pwd");
                model.setLoginId(loginId);
                return model;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel model, LoginModel dbmodel, LoginTemplate template) {
                // 不需要覆盖，直接转调
                return template.match(model, dbmodel);
            }
        });

        System.out.println("普通人员登录：===>"+login);
        LoginTemplate workerLogin =new LoginTemplate();
        login=workerLogin.login(model,new LoginCallback(){
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel model = new LoginModel();
                model.setPwd("worker");
                model.setLoginId(loginId);
                return model;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                System.out.println("进行MD5加密");
                return pwd;
            }


            @Override
            public boolean match(LoginModel model, LoginModel dbmodel, LoginTemplate template) {
                // 不需要覆盖，直接转调
                return template.match(model,dbmodel);
            }
        });

        System.out.println("工作人员登录：===>"+login);


    }
}
