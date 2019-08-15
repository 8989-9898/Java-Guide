package com.ly.flyweight.pattern;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用模式的权限管理实现
 * @Date: 2019/8/10 19:48
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 使用安全管理类，先登录，在进行权限认证
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("李四");
        mgr.login("张三");
        boolean b = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean b1 = mgr.hasPermit("李四", "薪资数据", "查看");
        System.out.println("张三 ===> "+b);
        System.out.println("李四 ===> "+b1);

        for (int i = 0; i < 3; i++) {
            mgr.login("张三"+i);
            mgr.hasPermit("张三"+i, "人员列表", "查看");
        }
    }

    /**
     * 执行结果，每个权限对象都是相同的对象
     *
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@677327b6
     * model === 人员列表  查看
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@677327b6
     * model === 人员列表  查看
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@14ae5a5
     * model === 薪资数据  查看
     * 张三 ===> false
     * 李四 ===> true
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@677327b6
     * model === 人员列表  查看
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@677327b6
     * model === 人员列表  查看
     * model === com.ly.flyweight.pattern.AuthorizationFlyweight@677327b6
     * model === 人员列表  查看
     *
     * */
}
