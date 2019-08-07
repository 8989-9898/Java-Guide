package com.ly.strategy.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.strategy.no_pattern
 * @ClassName: Price
 * @Author: lin
 * @Description: 计算折扣类
 * @Date: 2019/8/7 19:47
 * @Version: 1.0
 */
public class Price {
    /**
     * 报价，对不同的类型，大不同的折扣
     * @param goodsPrice 原价
     * @param customerType 客户类型
     * @return 折扣价格
     */
    public double quote(double goodsPrice,String customerType){
        if ("普通客户".equals(customerType)) {
            return calcPriceForNormal(goodsPrice);
        }else if ("老客户".equals(customerType)){

            return calcPriceForOld(goodsPrice);
        }else if ("大客户".equals(customerType)){

            return calcPriceForLarge(goodsPrice);
        }
        return goodsPrice;
    }

    private double calcPriceForLarge(double goodsPrice) {
        System.out.println("大客户统一折扣10%");
        return goodsPrice*(1-0.1);
    }

    private double calcPriceForOld(double goodsPrice) {
        System.out.println("老客户统一折扣5%");
        return goodsPrice*(1-0.05);
    }

    private double calcPriceForNormal(double price){
        System.out.println("普通用户或者新客户是没有折扣的");
        return price;
    }
}
