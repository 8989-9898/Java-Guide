package com.ly.flyweight.manager;

import com.ly.mediator.model.User;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.pattern
 * @ClassName: FlyweightFactory
 * @Author: lin
 * @Description: 享元工厂，实现成单例，加入引用计数和垃圾回收功能
 * @Date: 2019/8/10 20:23
 * @Version: 1.0
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
        // 启动缓存清除线程
        ClearCache clearCache = new ClearCache();
        clearCache.start();
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 缓存多个 Flyweight 对象
     */
    private Map<String, Flyweight> map = new HashMap<>();

    /**
     * 保存被共享对象的配置，key 是有个 user
     */
    private Map<String, CacheConfModel> configs = new HashMap<>();

    /**
     * 保存被共享对象的引用次数，key 是有个 user
     */
    private Map<String, Integer> counts = new HashMap<>();

    private final long DURABLE_TIME = 6 * 1000L;

    /**
     * 获取某个被共享的对象的引用次数
     *
     * @param key 共享对象的 key
     * @return 次数
     */
    public synchronized Integer getUseCounts(String key) {
        Integer integer = counts.get(key);
        if (integer == null) {
            integer = 0;
        }
        return integer;
    }


    /**
     * 获取 key 对应的享元对象
     *
     * @param key 对应的 key
     * @return 对应的享元对象
     */
    public synchronized Flyweight getFlyweight(String key) {
        Flyweight flyweight = map.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            // 设置初始的引用次数
            counts.put(key, 1);
            // 设置初始的享元配置
            configs.put(key, new CacheConfModel(System.currentTimeMillis(), DURABLE_TIME, false));
            map.put(key, flyweight);
        } else {
            // 将开始时间从新设置
            CacheConfModel model = configs.get(key);
            model.setBeginTime(System.currentTimeMillis());
            configs.put(key, model);
            // 将引用次数加一
            Integer integer = counts.get(key);
            integer += 1;
            counts.put(key, integer);
        }
        return flyweight;
    }

    /**
     * 删除 key 对应的享元对象，同时删除对应的缓存配置和引用计数
     *
     * @param key 要删除的享元对象的 key
     */
    public synchronized void removeFlyweight(String key) {
        map.remove(key);
        configs.remove(key);
        counts.remove(key);
    }

    /**
     * 维护清除线程，内部使用
     */
    private class ClearCache extends Thread {

        @Override
        public void run() {
            while (true) {
                // 记录需要删除的 key
                Set<String> sets = new HashSet<>();
                Set<String> keySet = configs.keySet();
                for (String key : keySet) {
                    CacheConfModel model = configs.get(key);
                    // 判断是否是需要删除的享元配置
                    if (System.currentTimeMillis() - model.getBeginTime() > model.getDurableTime()) {
                        // 记录可以清除的 key
                        sets.add(key);
                    }
                }

                System.out.println(" new thread ==> " + map.size() + " , " + map.keySet());

                // 执行清除
                for (String key : sets) {
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
