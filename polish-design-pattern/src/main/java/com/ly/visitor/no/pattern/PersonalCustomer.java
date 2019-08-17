package com.ly.visitor.no.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.visitor.no.pattern
 * @ClassName: PersonalCustomer
 * @Author: lin
 * @Description: 个人客户
 * @Date: 2019/8/17 14:29
 * @Version: 1.0
 */
public class PersonalCustomer extends Customer {

    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 年龄
     */
    private int age;
    /**
     * 注册地址
     */
    private String registerAddress;

    @Override
    public void serviceRequest() {
        System.out.println(this.getName() + "个人客户提出的服务请求");
    }
    @Override
    public void predilectionAnalyze() {
        System.out.println("根据客户的购买历史记录，对个人客户："+this.getName()+"进行产品偏好分析！");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("根据客户的购买金额和数量，对个人客户："+this.getName()+" 进行价值分析");
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }
}
