package com.ly.prototype.protortype_manager;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.protortype_manager
 * @ClassName: PrototypeImpl1
 * @Author: lin
 * @Description: 具体的实现1
 * @Date: 2019/7/28 13:09
 * @Version: 1.0
 */
public class PrototypeImpl1 implements Prototype{

    private String name;

    @Override
    public Prototype clone() {
        PrototypeImpl1 impl1 = new PrototypeImpl1();
        impl1.setName(this.name);
        return impl1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
this.name=name;
    }

    @Override
    public String toString() {
        return "PrototypeImpl1{" +
                "name='" + name + '\'' +
                '}';
    }
}
