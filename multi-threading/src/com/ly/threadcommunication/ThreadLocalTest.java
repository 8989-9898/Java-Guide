package com.ly.threadcommunication;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.threadcommunication
 * @ClassName: ThreadLocalTest
 * @Author: lin
 * @Description: 使用ThreadLocal进行线程变量间的隔离
 * @Date: 2019-06-27 8:41
 * @Version: 1.0
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        if (local.get() == null) {
            local.set("添加测试数据");
        }
        System.out.println(local.get());
        System.out.println(local.get());
    }
}

/**
 * 继承ThreadLocal类重写初始值的方法
 * ThreadLocal无法拿到父线程的变量值
 */
class MyThreadLocal extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}

/**
 * 验证线程变量间的隔离性
 */
class ThreadIsolation {
    public static void main(String[] args) {
        MyThreadLocal local = new MyThreadLocal();
        try {
            ThreadA a = new ThreadA(local);
            a.start();
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "=========" + local.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ThreadA extends Thread {
        private MyThreadLocal local;

        public ThreadA(MyThreadLocal local) {
            this.local = local;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-------" + local.get());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

/**
 * InheritableThreadLocal 可以实现子线程获取父线程的值
 */
class MyInheritableThreadLocal extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }

    /**
     * 用于修改子类的值
     * @param parentValue
     * @return
     */
    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "====";
    }
}

/**
 * 验证线程变量间父子继承性
 */
class ThreadExtends {
    public static void main(String[] args) {
        MyInheritableThreadLocal local = new MyInheritableThreadLocal();
        try {
            System.out.println(Thread.currentThread().getName() + "=========" + local.get());
            ThreadA a = new ThreadA(local);
            a.start();
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "=========" + local.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ThreadA extends Thread {
        private MyInheritableThreadLocal local;

        public ThreadA(MyInheritableThreadLocal local) {
            this.local = local;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-------" + local.get());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}