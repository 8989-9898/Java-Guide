package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: LoginTemplate
 * @Author: lin
 * @Description: 登录的模板方法
 * @Date: 2019-08-06 16:33
 * @Version: 1.0
 */
public abstract class LoginTemplate {
    /**
     * 盐，用于混交md5
     */
    protected static final String SLAT = "&%5123***&&%%$$#@";
    public boolean login(LoginModel model){
        LoginModel dbmodel=this.findWorkerByWorkerId(model.getLoginId());
        // 判断获取的信息是否为空，
        if (dbmodel!=null) {
            // 将密码进行加密
            String encryptPwd=encryptPwd(model.getPwd());
            model.setPwd(encryptPwd);
            if (match(model,dbmodel)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取一条工作人员信息
     * @param loginId
     * @return
     */
    public abstract LoginModel findWorkerByWorkerId(String loginId);

    /**
     * 进行秘密加密,(演示)
     * @param pwd
     * @return
     */
    public String encryptPwd(String pwd){
        return pwd;
    }

    /**
     * 判断登录信息
     * @param loginModel 登录信息
     * @param dbmodel 从数据库中查询出来的信息
     * @return
     */
    public boolean match(LoginModel loginModel,LoginModel dbmodel){
        if (loginModel.getLoginId().equals(dbmodel.getLoginId()) && loginModel.getPwd().equals(dbmodel.getPwd())) {
            return true;
        }
        return false;
    }
}
