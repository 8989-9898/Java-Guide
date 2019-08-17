package com.ly.visitor.customer;


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

    @Override
    public void accept(Visitor visitor) {
        // 回调相应的访问者对象的方法
        visitor.visitEnterpriseCustomer(this);
    }
}

