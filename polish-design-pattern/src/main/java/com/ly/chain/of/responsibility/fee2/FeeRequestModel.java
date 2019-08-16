package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: FeeRequestModel
 * @Author: lin
 * @Description: 申请聚餐费用的请求对象,继承通用的请求对象
 * @Date: 2019-08-16 13:40
 * @Version: 1.0
 */
public class FeeRequestModel extends RequestModel {
    /**
     * 约定具体的业务类型
     */
    public final static String FEE_TYPE="fee";
    public FeeRequestModel() {
        super (FEE_TYPE);
    }

    private String user;
    private double fee;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public FeeRequestModel(String user, double fee) {
        super (FEE_TYPE);
        this.user = user;
        this.fee = fee;
    }
}
