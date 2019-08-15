package com.ly.flyweight.manager;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用模式的权限管理实现，实现缓存的引用次数计数和缓存的清除功能（垃圾回收 GC）
 * @Date: 2019/8/10 19:48
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 使用安全管理类，先登录，在进行权限认证
        SecurityMgr mgr = SecurityMgr.getInstance();
        boolean b = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean b1 = mgr.hasPermit("李四", "薪资数据", "查看");
        boolean b3 = mgr.hasPermit("李四", "薪资数据", "修改");
        System.out.println("张三 ===> "+b);
        System.out.println("李四,薪资查看 ===> "+b1);
        System.out.println("李四,薪资修改 ===> "+b3);

        for (int i = 0; i < 3; i++) {
            mgr.hasPermit("张三"+i, "人员列表", "查看");
        }
        // 这里的引用次数指的是使用的次数
        System.out.println("薪资数据,查看 被使用了 "+FlyweightFactory.getInstance().getUseCounts("薪资数据,查看")+"次");
        System.out.println("薪资数据,修改 被使用了 "+FlyweightFactory.getInstance().getUseCounts("薪资数据,修改")+"次");
        System.out.println("人员列表,查看 被使用了 "+FlyweightFactory.getInstance().getUseCounts("人员列表,查看")+"次");
    }
}
