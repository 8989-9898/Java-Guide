package com.ly.template.pattern;

import java.security.MessageDigest;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: WorkerLogin
 * @Author: lin
 * @Description: 工作人员的登录控制逻辑
 * @Date: 2019-08-06 16:45
 * @Version: 1.0
 */
public class WorkerLogin extends LoginTemplate {
    @Override
    public LoginModel findWorkerByWorkerId(String loginId) {
        LoginModel model = new LoginModel();
        model.setLoginId(loginId);
        model.setPwd("8ee51dfa6fc3cf7e6f38ff20b7086446");
        return model;
    }

    @Override
    public String encryptPwd(String pwd) {
        System.out.println("进行MD5加密");
        try {
            pwd = pwd + SLAT;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(pwd.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
