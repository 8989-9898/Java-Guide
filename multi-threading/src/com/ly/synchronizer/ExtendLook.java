package com.ly.synchronizer;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.synchronizer
 * @ClassName: ExtendLook
 * @Author: lin
 * @Description: 使用 synchronized 使用锁的继承性
 * @Date: 2019-06-20 17:42
 * @Version: 1.0
 */
public class ExtendLook {
    public static void main(String[] args) {
        new Thread(()->{
            Child child = new Child();
           child.main();
        }).start();
    }
}

class Parent{
    public synchronized void main(){
        System.out.println("parent is main");
    }
}

/**
 * 子类继承父类的的方法实现锁的继承
 */
class Child extends Parent{

    @Override
    public synchronized void main() {
        System.out.println("child is main");
        super.main();
    }
}