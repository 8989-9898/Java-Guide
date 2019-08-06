package com.ly.template.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: WorkerModel
 * @Author: lin
 * @Description: 工作人员的数据模型
 * @Date: 2019-08-06 16:07
 * @Version: 1.0
 */
public class WorkerModel {

    private String uuid,workerId,pwd,name;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
