package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: Work
 * @Author: lin
 * @Description: 工作类
 * @Date: 2019-07-11 15:09
 * @Version: 1.0
 */
public class Work {
    private State state;
    private double hours;
    private boolean taskFinish;

    public void writeProgram() {
        state.writeProgram(this);
    }

    public Work() {
        // 初始化为上班状态
        state=new ForenoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public boolean isTaskFinish() {
        return taskFinish;
    }

    public void setTaskFinish(boolean taskFinish) {
        this.taskFinish = taskFinish;
    }
}
