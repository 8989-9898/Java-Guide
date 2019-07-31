package com.ly.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.proxy.dynamic
 * @ClassName: DynamicProxy
 * @Author: lin
 * @Description: 使用java的动态代理，实现订单控制
 * @Date: 2019-07-31 9:43
 * @Version: 1.0
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private OrderApi order = null;

    /**
     * 获取绑定好代理和具体目标对象后的目标对象接口
     *
     * @param order 具体的订单对象，相当于具体的目标对象
     * @return 绑定好代理和具体的目标对象后的目标对象的接口
     */
    public OrderApi getProxyInterface(Order order) {
        // 设置被代理的对象，好方便invoke方法的操作
        this.order = order;
        // 把真正的订单对象和动态代理关联起来
        OrderApi api = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
        return api;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 判断是否是以 set 开头的方法
        if (method.getName().startsWith("set")) {
            if (order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
                return method.invoke(order, args);
            } else {
                System.out.println(args[1] + "，你没有权限操作该订单");
                return null;
            }
        } else {
            return method.invoke(order, args);
        }
    }
}
