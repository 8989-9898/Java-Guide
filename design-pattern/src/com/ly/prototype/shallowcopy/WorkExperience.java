package com.ly.prototype.shallowcopy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.prototype.shallowcopy
 * @ClassName: WorkExperience
 * @Author: lin
 * @Description:
 * @Date: 2019-07-08 13:13
 * @Version: 1.0
 */
public class WorkExperience {

    private String timeArea;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    @Override
    public String toString() {
        return "WorkExperience{" +
                "timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
