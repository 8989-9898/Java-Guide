package com.ly.template.no_pattern;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: WorkerLogin
 * @Author: lin
 * @Description: 工作人员的登录逻辑
 * @Date: 2019-08-06 16:09
 * @Version: 1.0
 */
public class WorkerLogin {

    public boolean login(WorkerLoginModel model){
        WorkerModel worker=this.findWorkerByWorkerId(model.getWorkerId());
        // 判断获取的信息是否为空，
        if (worker!=null) {
            // 将密码进行加密
            String encryptPwd=encryptPwd(model.getPwd());
            if (encryptPwd.equals(worker.getPwd())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取一条工作人员信息
     * @param workerId
     * @return
     */
    private WorkerModel findWorkerByWorkerId(String workerId) {
        WorkerModel model = new WorkerModel();
        model.setWorkerId(workerId);
        model.setName("admin");
        model.setUuid("admin001");
        model.setPwd("administrator");
        return model;
    }

    /**
     * 进行秘密加密,(演示)
     * @param pwd
     * @return
     */
    public String encryptPwd(String pwd){
        return pwd;
    }



}
