package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: RestState
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:24
 * @Version: 1.0
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间是：" + work.getHours() + " 点，下班回家了");
    }
}
