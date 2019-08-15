package com.ly.flyweight.no.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: AuthorizationModel
 * @Author: lin
 * @Description: 描述授权数据的数据 model
 * @Date: 2019/8/10 13:44
 * @Version: 1.0
 */
public class AuthorizationModel {

    /**
     * 人员
     */
    private String user;

    /**
     * 安全实体
     */
    private String securityEntity;

    /**
     * 权限
     */
    private String permit;


    public AuthorizationModel(String user, String securityEntity, String permit) {
        this.user = user;
        this.securityEntity = securityEntity;
        this.permit = permit;
    }

    public AuthorizationModel() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }
}
