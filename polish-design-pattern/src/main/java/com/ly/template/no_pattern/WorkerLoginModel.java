package com.ly.template.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: WorkerLoginModel
 * @Author: lin
 * @Description: 工作人员登录时的数据模型,
 * @Date: 2019-08-06 16:06
 * @Version: 1.0
 */
public class WorkerLoginModel {
    // 属性可以自己定义更多
    private String workerId,pwd;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
