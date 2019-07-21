package com.ly.adaptor.adaptor;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.adaptor
 * @ClassName: Adaptor
 * @Author: lin
 * @Description: 适配器类
 * @Date: 2019/7/20 16:28
 * @Version: 1.0
 */
public class Adaptor implements Target{
    /**
     * 持有要被适配类的对象
     */
    private Adaptee adaptee;

    /**
     * 在构造方法是传入被适配的类
     * @param adaptee
     */
    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 调用客户端需要的接口
     */
    @Override
    public void request() {
        // 实际调用已经存在的功能接口
        adaptee.oldRequest();
    }
}
