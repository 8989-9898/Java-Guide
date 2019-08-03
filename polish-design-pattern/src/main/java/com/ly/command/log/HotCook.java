package com.ly.command.log;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.orderdishes
 * @ClassName: HotCook
 * @Author: lin
 * @Description: 做热菜的厨师（具体的接受者）
 * @Date: 2019/8/3 15:34
 * @Version: 1.0
 */
public class HotCook implements CookApi, Runnable {


    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int num, String name) {
        // 做菜需要消耗的时间，随机
        int outTime = (int) (20 * Math.random());
        System.out.println(this.name + " 厨师正在为：" + num + " 号桌做：" + name);
        try {
            Thread.sleep(outTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " 厨师为：" + num + " 号桌做好了：" + name + ",耗时：" + outTime + "秒");
    }

    @Override
    public void run() {
        while (true) {
            Command command=CommandQueue.getOneCommand();
            if (command!=null) {
                // 说明取到了命令对象，这个对象还没有设置接收者，将自己设置进去
                command.setCookApi(this);
                // 执行命令
                command.execute();
            }
            try {
                // 休息一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
