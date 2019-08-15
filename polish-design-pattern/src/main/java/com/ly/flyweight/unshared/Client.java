package com.ly.flyweight.unshared;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用模式的权限管理实现，同时使用共享和不共享
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
        boolean b3 = mgr.hasPermit("李四", "薪资数据", "修改");
        System.out.println("张三 ===> "+b);
        System.out.println("李四,薪资查看 ===> "+b1);
        System.out.println("李四,薪资修改 ===> "+b3);

        for (int i = 0; i < 3; i++) {
            mgr.login("张三"+i);
            mgr.hasPermit("张三"+i, "人员列表", "查看");
        }
    }


    /**
     * 享元模式的优点：
     *      减少对象数量，节省内存空间。
     *
     * 享元模式的缺点：
     *      维护共享对象，需要额外的开销。
     *
     *  享元模式的本质是：分离与共享。
     *      分离的是对象内部中变和不变的部分，共享的是对象中不变的部分。享元模式的关键之处就在与分离变与不变，
     *      把不变的部分作为享元模式的内部状态，而变化部分作为外部对象。有外部来维护，这样享元对象就能被共享，
     *      从而减少对象数量，并节省内存空间。
     *
     * */
}
