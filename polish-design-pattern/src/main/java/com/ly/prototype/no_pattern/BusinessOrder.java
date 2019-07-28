package com.ly.prototype.no_pattern;

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

            // 定义一个用于拆分时保存的对象
            OrderApi newOrder=null;
            if (order instanceof PersonalOrder) {
                PersonalOrder personalOrder = new PersonalOrder();
                PersonalOrder ps=(PersonalOrder) order;
                personalOrder.setCustomerName(ps.getCustomerName());
                personalOrder.setProductId(ps.getProductId());
                personalOrder.setOrderProductNum(1000);
                newOrder=personalOrder;
            }else if (order instanceof EnterpriseOrder){
                EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
                EnterpriseOrder ps=(EnterpriseOrder) order;
                enterpriseOrder.setEnterpriseName(ps.getEnterpriseName());
                enterpriseOrder.setProductId(ps.getProductId());
                enterpriseOrder.setOrderProductNum(1000);
                newOrder=enterpriseOrder;
            }
            // 将原来的订单数减少 1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分的子订单："+newOrder);
        }
        System.out.println("订单："+order);
    }

}
