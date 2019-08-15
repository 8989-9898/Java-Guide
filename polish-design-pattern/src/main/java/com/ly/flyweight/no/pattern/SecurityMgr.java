package com.ly.flyweight.no.pattern;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: SecurityMgr
 * @Author: lin
 * @Description: 安全管理，实现为单例
 * @Date: 2019/8/10 19:27
 * @Version: 1.0
 */
public class SecurityMgr {

    // 饿汉式
    private static SecurityMgr securityMgr= new SecurityMgr();

    private SecurityMgr(){}

    public static SecurityMgr getInstance(){
        return securityMgr;
    }

    /**
     * 用来存储登录人员的权限信息
     */
    private Map<String,List<AuthorizationModel>> maps=new HashMap<>();

    public void login(String user){
        // 获取用户对应的权限
        List<AuthorizationModel> models=queryByUser(user);
        // 将登录用户对应的权限保存到缓存中
        maps.put(user,models);
    }

    /**
     * 检查用户对某个实体是否有具有某种权限
     * @param user 用户
     * @param securityEntity 某种实体
     * @param permit 权限
     * @return 是否具有 true表示是 | false 表示没有
     */
    public boolean hasPermit(String user,String securityEntity,String permit){
        // 根据用户名获取保存在缓存中的用户权限
        List<AuthorizationModel> models = maps.get(user);
        if (models==null||models.size()==0) {
            System.out.println(user+"没有登录或者没有分配任何权限");
            return false;
        }
        for (AuthorizationModel model : models) {
            // 输出当前的实例，查看是否是同一个对象
            System.out.println("model === " +model);
            System.out.println("model === " +model.getUser()+"  "+model.getSecurityEntity()+"  "+model.getPermit());
            if (model.getSecurityEntity().equals(securityEntity)&&model.getPermit().equals(permit)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 查询数据库获取用户对应的权限
     * @param user 用户名
     * @return 用户权限集合
     */
    private List<AuthorizationModel> queryByUser(String user) {
        List<AuthorizationModel> models=new ArrayList<>();
        for (String s : DBCache.DB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                AuthorizationModel model=new AuthorizationModel(split[0],split[1],split[2]);
                models.add(model);
            }
        }
        return models;
    }
}
