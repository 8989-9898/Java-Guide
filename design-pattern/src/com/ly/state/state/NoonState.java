package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: NoonState
 * @Author: lin
 * @Description: 中午状态
 * @Date: 2019-07-11 15:18
 * @Version: 1.0
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHours()<13) {
            System.out.println("当前时间是：" + work.getHours() + " 点，饿了，午饭：犯困午休");
        }else{
            // 到达下午，切换为下午状态
            work.setState(new AfteroonState());
            work.writeProgram();
        }
    }
}
