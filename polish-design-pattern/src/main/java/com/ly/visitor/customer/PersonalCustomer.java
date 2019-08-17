package com.ly.visitor.customer;

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

    @Override
    public void accept(Visitor visitor) {
        // 回调相应的访问者对象的方法
        visitor.visitPersonalCustomer(this);
    }
}
