package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: AfteroonState
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:19
 * @Version: 1.0
 */
public class AfteroonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHours() < 17) {
            System.out.println("当前时间是：" + work.getHours() + " 点，下午状态不错，继续努力");
        } else {
            // 到达晚间，切换为晚间状态
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
