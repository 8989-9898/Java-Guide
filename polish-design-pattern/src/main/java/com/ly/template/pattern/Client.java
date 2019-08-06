package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用模板方法的登录控制
 * @Date: 2019-08-06 16:46
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LoginModel model = new LoginModel();
        model.setPwd("administrator");
        model.setLoginId("admin");
        NormalLogin normalLogin = new NormalLogin();
        WorkerLogin workerLogin = new WorkerLogin();

        System.out.println("可以进行工作人员的登录："+workerLogin.login(model));
        System.out.println("可以进行普通人员的登录："+normalLogin.login(model));
    }

    /**
     * 模板方法模式的优点：
     *      实现代码复用：模板方法模式是一种实现代码复用的很好的手段，通过把子类的公共功能提炼和抽取，把公共的部分
     *      放到模板中去实现。
     *
     * 模板方法模式的缺点：
     *      算法骨架不容易升级：模板方法的最基本功能就是通过模板的制定，把算法骨架完全定下来。事实上模板和子类是非常
     *      耦合的，如果要对模板中的算法骨架进行更改，可能会要求所有的子类进行相应的变化。所以抽取算法骨架的时候要特
     *      别小心，尽量确保是不会变化的部分才放到模板中。
     *
     * 模板方法的本质是：固定算法骨架。
     * */
}
