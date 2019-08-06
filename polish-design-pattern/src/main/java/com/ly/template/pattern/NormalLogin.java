package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: NormalLogin
 * @Author: lin
 * @Description: 普通人员的登录控制逻辑
 * @Date: 2019-08-06 16:43
 * @Version: 1.0
 */
public class NormalLogin extends LoginTemplate {
    @Override
    public LoginModel findWorkerByWorkerId(String loginId) {
        LoginModel model = new LoginModel();
        model.setPwd("zhagnsan");
        model.setLoginId(loginId);
        return model;
    }
}
