package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: PreFeeRequestModel
 * @Author: lin
 * @Description: 封装差旅费申请业务的相关数据
 * @Date: 2019-08-16 13:54
 * @Version: 1.0
 */
public class PreFeeRequestModel extends RequestModel {

    public final static String PRE_FEE_TYPE="preFee";

    public PreFeeRequestModel() {
        super (PRE_FEE_TYPE);
    }

    private String user;
    private double preFee;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getPreFee() {
        return preFee;
    }

    public void setPreFee(double preFee) {
        this.preFee = preFee;
    }

    public PreFeeRequestModel(String user, double preFee) {
        super (PRE_FEE_TYPE);
        this.user = user;
        this.preFee = preFee;
    }
}
