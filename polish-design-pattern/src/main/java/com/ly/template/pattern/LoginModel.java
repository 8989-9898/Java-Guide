package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: LoginModel
 * @Author: lin
 * @Description: 对登录的数据进行封装
 * @Date: 2019-08-06 16:31
 * @Version: 1.0
 */
public class LoginModel {
    /**
     * 登录人员的编号（可以是工作人员和普通用户）和密码
     */
    private String loginId,pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
