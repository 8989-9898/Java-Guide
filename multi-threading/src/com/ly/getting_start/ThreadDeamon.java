package com.ly.getting_start;

import sun.awt.windows.ThemeReader;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.getting_start
 * @ClassName: ThreadDeamon
 * @Author: lin
 * @Description: 守护线程
 * @Date: 2019-06-20 16:53
 * @Version: 1.0
 */
public class ThreadDeamon implements Runnable {
    @Override
    public void run() {
        int i=0;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDeamon deamon=new ThreadDeamon();
        Thread thread = new Thread(deamon);
        // 设置当前线程为守护线程，守护线程在其它线程执行完成后会自动销毁
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(2000);
        System.out.println("我执行完了，守护线程可以 kill");
    }
}
