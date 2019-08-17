package com.ly.visitor.no.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.no.pattern
 * @ClassName: EnterPriseCustomer
 * @Author: lin
 * @Description: 企业客户
 * @Date: 2019/8/17 14:05
 * @Version: 1.0
 */
public class EnterPriseCustomer extends Customer{

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String linkTelephone;

    /**
     * 企业注册地址
     */
    private String registerAddress;

    /**
     * 企业客户提出服务请求的方法
     */
    @Override
    public void serviceRequest() {
        // 提出的具体的请求
        System.out.println(this.getName()+"企业提出的服务请求！");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("根据客户的购买历史记录，对企业客户："+this.getName()+"进行产品偏好分析！");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("根据客户的购买金额和数量，对企业客户："+this.getName()+" 进行价值分析");
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }
}

