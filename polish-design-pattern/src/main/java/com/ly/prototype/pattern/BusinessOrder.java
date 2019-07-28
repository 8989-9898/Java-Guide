package com.ly.prototype.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.no_pattern
 * @ClassName: BusinessOrder
 * @Author: lin
 * @Description: 处理订单的业务对象
 * @Date: 2019/7/27 18:18
 * @Version: 1.0
 */
public class BusinessOrder {

    public void saveOrder(OrderApi order){


        // 判断订单数是否大于 1000 ，大于就将订单进行拆分为每个订单为 1000 的或者小于1000 的订单
        while (order.getOrderProductNum()>1000) {

            // 在新建一份订单的时候，调运克隆的方法的克隆一个全新的对象
            OrderApi newOrder= order.orderClone();
            newOrder.setOrderProductNum(1000);

            // 将原来的订单数减少 1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分的子订单："+newOrder);
        }
        System.out.println("订单："+order);
    }

}
