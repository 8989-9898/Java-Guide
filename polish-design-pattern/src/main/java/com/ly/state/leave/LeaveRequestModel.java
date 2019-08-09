package com.ly.state.leave;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.leave
 * @ClassName: LeaveRequestModel
 * @Author: lin
 * @Description: 定义状态模型，请假单
 * @Date: 2019-08-09 10:18
 * @Version: 1.0
 */
public class LeaveRequestModel {
    /**
     * 请假人
     */
    private String user;
    /**
     * 请假时间
     */
    private String beginDate;
    /**
     * 请假天数
     */
    private Integer leaveDays;
    /**
     * 请假结果
     */
    private String result;

    public LeaveRequestModel(String user, String beginDate, Integer leaveDays) {
        this.user = user;
        this.beginDate = beginDate;
        this.leaveDays = leaveDays;
    }

    public LeaveRequestModel() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
