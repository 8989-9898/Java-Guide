package com.ly.template.callback;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.template.callback
 * @ClassName: LoginCallback
 * @Author: lin
 * @Description: 登录控制的模板方法需要的回调接口，需要把所有需要的接口方法都定义出来
 *               或者说是所有可以被扩展的方法读需要被定义出来
 * @Date: 2019/8/6 20:20
 * @Version: 1.0
 */
public interface LoginCallback {

    /**
     * 根据登录编号查询存储中的相应的数据
     * @param loginId
     * @return 登录编号相应的数据
     */
    public LoginModel findLoginUser(String loginId);

    /**
     * 对密码进行加密
     * @param pwd 密码
     * @param template LoginTemplate 对象，通过他来调用在LoginTemplate 中定义的公共方法和默认实现
     * @return
     */
    public String encryptPwd(String pwd, LoginTemplate template);

    /**
     * 判断登录信息是否正确
     * @param model 登录输入的信息
     * @param dbmodel 从数据库中获取的信息
     * @param template LoginTemplate 对象，通过他来调用在LoginTemplate 中定义的公共方法和默认实现
     * @return
     */
    public boolean match(LoginModel model,LoginModel dbmodel,LoginTemplate template);
}
