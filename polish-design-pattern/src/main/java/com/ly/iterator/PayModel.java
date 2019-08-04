package com.ly.iterator;

import java.util.Date;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator
 * @ClassName: PayModel
 * @Author: lin
 * @Description: 一个简单的工资模型对象
 * @Date: 2019/8/4 17:31
 * @Version: 1.0
 */
public class PayModel {

    private String name;
    private double pay;
    private Date date;


    @Override
    public String toString() {
        return "PayModel{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                ", date=" + date  +
                '}';
    }

    public PayModel() {
    }

    public PayModel(String name, double pay, Date date) {
        this.name = name;
        this.pay = pay;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
