package com.ly.adaptor.adaptor;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.adaptor
 * @ClassName: Adaptee
 * @Author: lin
 * @Description: 已经存在的方法，需要配适配的接口
 * @Date: 2019/7/20 16:26
 * @Version: 1.0
 */
public class Adaptee {
    /**
     * 示意反法，原本已经存在，已经实现的方法
     */
    public void oldRequest(){
        System.out.println("执行具体的已经存在的功能，需要配适配的方法");
    }
}
