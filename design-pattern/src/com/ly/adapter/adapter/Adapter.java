package com.ly.adapter.adapter;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.adapter
 * @ClassName: Adapter
 * @Author: lin
 * @Description: 适配两者之间的请求
 * @Date: 2019-07-11 16:05
 * @Version: 1.0
 */
public class Adapter extends Target {

    private Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        // 方法内实际调用的是 adaptee 的方法
        adaptee.specificRequest();
    }
}
