package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: NormalLogin2
 * @Author: lin
 * @Description: 扩展普通用户的登录控制，（加强版）
 * @Date: 2019-08-06 17:03
 * @Version: 1.0
 */
public class NormalLogin2 extends LoginTemplate {
    @Override
    public LoginModel findWorkerByWorkerId(String loginId) {
        NormalLoginModel model = new NormalLoginModel();
        model.setLoginId(loginId);
        model.setPwd("users");
        model.setQuestion("testQuestion");
        model.setAnswer("testAnswer");
        return model;
    }

    /**
     * 覆盖登录参数验证方法
     * @param loginModel 登录信息
     * @param dbmodel 从数据库中查询出来的信息
     * @return
     */
    @Override
    public boolean match(LoginModel loginModel, LoginModel dbmodel) {
        // 先调用父类实现好的，验证编号和密码
        boolean match = super.match(loginModel, dbmodel);
        if (match) {
            // 将数据对象转换为自己需要的数据对象
            NormalLoginModel lmodel = (NormalLoginModel) loginModel;
            NormalLoginModel dmodel= (NormalLoginModel) dbmodel;
            // 验证问题和问题密码
            if (lmodel.getQuestion().equals(dmodel.getQuestion())&&lmodel.getAnswer().equals(dmodel.getAnswer())) {
                return true;
            }
        }
        return false;
    }
}
