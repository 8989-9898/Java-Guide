package com.ly.template.callback;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.template.callback
 * @ClassName: LoginTemplate
 * @Author: lin
 * @Description: 登录的模板方法，不在是抽象的了
 * @Date: 2019/8/6 20:41
 * @Version: 1.0
 */
public class LoginTemplate {

    /**
     * 登录方法，判断登录信息
     * @param model 登录信息
     * @param callback 回调对象，需要在登录中使用的方法
     * @return
     */
    public final boolean login(LoginModel model,LoginCallback callback){
        // 根据 登录人员的编号查询数据
        LoginModel user = callback.findLoginUser(model.getLoginId());
        if (user!=null) {
            // 密码加密
            String s = callback.encryptPwd(model.getPwd(), this);
            model.setPwd(s);
            // 判断是否登录成功
            return callback.match(model,user,this);
        }
        return false;
    }

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
