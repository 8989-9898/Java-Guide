package com.ly.adaptor.adaptor;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.adaptor
 * @ClassName: Client
 * @Author: lin
 * @Description: 客户端
 * @Date: 2019/7/20 16:32
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 在创建客户端需要的接口对象时，传入要陪适配的对象
        Target adaptor = new Adaptor(new Adaptee());
        // 请求处理
        adaptor.request();
    }
}
