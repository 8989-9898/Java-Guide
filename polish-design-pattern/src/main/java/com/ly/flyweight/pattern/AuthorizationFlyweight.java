package com.ly.flyweight.pattern;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.pattern
 * @ClassName: AuthorizationFlyweight
 * @Author: lin
 * @Description: 封装授权数据中重复出现部分的享元对象
 * @Date: 2019/8/10 20:18
 * @Version: 1.0
 */
public class AuthorizationFlyweight implements Flyweight {

    /**
     * 安全实体
     */
    private String securityEntity;
    /**
     * 权限
     */
    private String permit;

    /**
     * 构造方法
     * @param state 状态数据，包含安全实体和权限，使用 "," 分割
     */
    public AuthorizationFlyweight(String state){
        String[] split = state.split(",");
        this.securityEntity=split[0];
        this.permit=split[1];
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity)&& this.permit.equals(permit)) {
            return true;
        }
        return false;
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }
}
