package com.ly.flyweight.unshared;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.pattern
 * @ClassName: FlyweightFactory
 * @Author: lin
 * @Description: 享元工厂，实现成单例
 * @Date: 2019/8/10 20:23
 * @Version: 1.0
 */
public class FlyweightFactory {

    private static FlyweightFactory factory=new FlyweightFactory();
    private FlyweightFactory(){}
    public static FlyweightFactory getInstance(){
        return factory;
    }

    /**
     * 缓存多个 Flyweight 对象
     */
    private Map<String ,Flyweight> map=new HashMap<>();


    /**
     * 获取 key 对应的享元对象
     * @param key 对应的 key
     * @return 对应的享元对象
     */
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = map.get(key);
        if (flyweight==null) {
            flyweight=new AuthorizationFlyweight(key);
            map.put(key,flyweight);
        }
        return flyweight;
    }
}
