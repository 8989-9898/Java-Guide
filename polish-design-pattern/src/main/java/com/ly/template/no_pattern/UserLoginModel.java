package com.ly.template.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: UserLoginModel
 * @Author: lin
 * @Description: 描述登录人员登录时填写的信息的数据模型
 * @Date: 2019-08-06 15:53
 * @Version: 1.0
 */
public class UserLoginModel {
    private String userId,pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
