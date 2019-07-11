package com.ly.state.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.one
 * @ClassName: Work
 * @Author: lin
 * @Description: 工作类
 * @Date: 2019-07-11 14:49
 * @Version: 1.0
 */
public class Work {
    private int hours;
    private boolean taskFinish;

    /**
     * 该放发判断分支太多，不易于维护和扩展
     */
    public void wirteProgram() {
        if (12 > hours) {
            System.out.println("当前时间是：" + hours + " 点，上午工作，精神百倍");
        } else if (hours < 13) {
            System.out.println("当前时间是：" + hours + " 点，饿了，午饭：犯困午休");
        } else if (hours < 17) {
            System.out.println("当前时间是：" + hours + " 点，下午状态不错，继续努力");
        } else {
            if (taskFinish) {
                System.out.println("当前时间是：" + hours + " 点，下班回家了");
            } else {
                if (hours < 21) {
                    System.out.println("当前时间是：" + hours + " 点，加班啊，好累啊");
                } else {
                    System.out.println("当前时间是：" + hours + " 点，不行了，坑不住了");
                }
            }
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isTaskFinish() {
        return taskFinish;
    }

    public void setTaskFinish(boolean taskFinish) {
        this.taskFinish = taskFinish;
    }
}
