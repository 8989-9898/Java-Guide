package com.ly.flyweight.no.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的权限管理实现
 *              在使用相同的数据时还是需要创建不同的对象，消耗了内存空间
 * @Date: 2019/8/10 19:48
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 使用安全管理类，先登录，在进行权限认证
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
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
     * 执行结果，每个权限对象都是不同的对象，但是有的数据是一样的(抛出用户名)
     *
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@677327b6
     * model === 张三  人员列表  查看
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@14ae5a5
     * model === 李四  人员列表  查看
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@7f31245a
     * model === 李四  薪资数据  查看
     * 张三 ===> false
     * 李四 ===> true
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@6d6f6e28
     * model === 张三0  人员列表  查看
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@135fbaa4
     * model === 张三1  人员列表  查看
     * model === com.ly.flyweight.no.pattern.AuthorizationModel@45ee12a7
     * model === 张三2  人员列表  查看
     *
     * */
}
