package com.ly.flyweight.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.pattern
 * @ClassName: Flyweight
 * @Author: lin
 * @Description: 描述授权数据的享元接口
 * @Date: 2019/8/10 20:14
 * @Version: 1.0
 */
public interface Flyweight {

    /**
     * 判断传入的安全对象和权限和享元对象内部的状态匹配
     * @param securityEntity 安全对象
     * @param permit 权限
     * @return true 表示是  | false 表示不是
     */
    boolean match(String securityEntity,String permit);
}
