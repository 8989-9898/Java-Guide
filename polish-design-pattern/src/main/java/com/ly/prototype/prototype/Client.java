package com.ly.prototype.prototype;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.prototype
 * @ClassName: Client
 * @Author: lin
 * @Description: 调用克隆的客户端
 * @Date: 2019/7/28 10:32
 * @Version: 1.0
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(){
        // 调用克隆接口方法，克隆自身
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }

    public static void main(String[] args) {
        Client client = new Client(new ConcretePrototype());
        client.operation();
    }
}
