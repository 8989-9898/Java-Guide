package com.ly.flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.flyweight
 * @ClassName: FlyweightFactory
 * @Author: lin
 * @Description: 享元工厂，用来创建并管理Flyweight对象，
 * @Date: 2019/7/15 21:06
 * @Version: 1.0
 */
public class FlyweightFactory {

    public Map<String,Flyweight> map=new HashMap<>(6);

    /**
     * 在初始化工厂时 添加四个实例
     */
    public FlyweightFactory() {
        map.put("A",new ConcreteFlyweight());
        map.put("B",new ConcreteFlyweight());
        map.put("C",new ConcreteFlyweight());
        map.put("D",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return map.get(key);
    }

}
