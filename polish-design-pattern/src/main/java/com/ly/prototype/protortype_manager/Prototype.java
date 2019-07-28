package com.ly.prototype.protortype_manager;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.protortype_manager
 * @ClassName: Prototype
 * @Author: lin
 * @Description: 定义原型的接口
 * @Date: 2019/7/28 12:58
 * @Version: 1.0
 */
public interface Prototype {

    public Prototype clone();
    public String getName();
    public void setName(String name);

}
