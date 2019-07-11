package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: SleepingState
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:24
 * @Version: 1.0
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间是：" + work.getHours() + " 点，不行了，坑不住了");
    }
}
