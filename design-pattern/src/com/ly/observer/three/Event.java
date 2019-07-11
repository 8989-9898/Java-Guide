package com.ly.observer.three;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.three
 * @ClassName: Event
 * @Author: lin
 * @Description: 事件类
 * @Date: 2019-07-11 9:30
 * @Version: 1.0
 */
public class Event {
    /**
     * 事件对象
     */
    private Object object;
    /**
     * 方法名称
     */
    private String methodName;
    /**
     * 参数对象
     */
    private Object[] params;
    /**
     * 参数的类类型
     */
    private Class[] paramType;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramType = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramType[i] = params[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(methodName, paramType);
        /**
         * 判断是否存在该方法
         */
        if (null == method) {
            System.out.println("不存在这个方法");
            return;
        }
        /**
         * 利用反射执行该需要通知的方法
         */
        method.invoke(this.object, params);
    }
}
