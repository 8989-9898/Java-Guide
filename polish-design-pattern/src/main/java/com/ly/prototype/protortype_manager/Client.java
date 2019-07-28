package com.ly.prototype.protortype_manager;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.protortype_manager
 * @ClassName: Client
 * @Author: lin
 * @Description: 原型管理器
 * @Date: 2019/7/28 13:18
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        PrototypeImpl1 impl1 = new PrototypeImpl1();
        PrototypeImpl2 impl2 = new PrototypeImpl2();
        impl1.setName("lisi");
        impl2.setName("flank");

        PrototypeManager.setCache("1",impl1);
        PrototypeManager.setCache("2",impl2);

        Prototype prototype = null;
        try {
            prototype = PrototypeManager.getPrototype("1").clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        prototype.setName("flank lin");

        System.out.println(impl1);
        System.out.println(impl2);
        System.out.println(prototype);

    }
}
