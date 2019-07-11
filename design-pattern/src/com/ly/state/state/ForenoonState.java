package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: ForenoonState
 * @Author: lin
 * @Description: 上午工作状态
 * @Date: 2019-07-11 15:15
 * @Version: 1.0
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHours()<12) {
            System.out.println("当前时间是：" + work.getHours() + " 点，上午工作，精神百倍");
        }else{
            // 到达中午，切换为中午状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
