package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: EveningState
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 15:21
 * @Version: 1.0
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isTaskFinish()) {
            // 工作完成切换为 回家状态
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHours() < 21) {
                System.out.println("当前时间是：" + work.getHours() + " 点，加班啊，好累啊");
            } else {
                // 工作未完成切换为 深夜加班状态
                work.setState(new SleepingState());
                work.writeProgram();
            }

        }
    }
}
