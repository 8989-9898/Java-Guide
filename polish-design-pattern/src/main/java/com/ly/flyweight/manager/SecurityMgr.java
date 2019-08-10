package com.ly.flyweight.manager;

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
     * 检查用户对某个实体是否有具有某种权限
     * @param user 用户
     * @param securityEntity 某种实体
     * @param permit 权限
     * @return 是否具有 true表示是 | false 表示没有
     */
    public boolean hasPermit(String user,String securityEntity,String permit){
        // 根据用户名获取保存在缓存中的用户权限
        List<Flyweight> models = queryByUser(user);
        if (models==null||models.size()==0) {
            System.out.println(user+"没有登录或者没有分配任何权限");
            return false;
        }
        for (Flyweight model : models) {
            // 输出当前的实例，查看是否是同一个对象
            System.out.println("model === " +model);
            if (model.match(securityEntity,permit)) {
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
    private List<Flyweight> queryByUser(String user) {
        List<Flyweight> models=new ArrayList<>();
        for (String s : DBCache.DB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                Flyweight flyweight=null;
                // 表示组合数据
                if (split[3].equals("2")) {
                    // 获取组合数据
                    String[] strings = DBCache.mapDB.get(split[1]);
                    flyweight=new UnsharedFlywight();
                    for (String string : strings) {
                        Flyweight fly = FlyweightFactory.getInstance().getFlyweight(string);
                        flyweight.add(fly);
                    }
                }else {
                    flyweight=FlyweightFactory.getInstance().getFlyweight(split[1]+","+split[2]);
                }
                models.add(flyweight);
            }
        }
        return models;
    }
}
