package com.ly.prototype.protortype_manager;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.protortype_manager
 * @ClassName: PrototypeManager
 * @Author: lin
 * @Description: 原型管理器，用于管理原型的创建和销毁
 * @Date: 2019/7/28 13:11
 * @Version: 1.0
 */
public class PrototypeManager {

    // 管理原型的缓存
    private static Map<String,Prototype> cache=new HashMap<>();

    private PrototypeManager(){}

    /**
     * 将原型加入缓存
     * @param prototypeId
     * @param prototype
     */
    public synchronized static void setCache(String prototypeId,Prototype prototype){
        cache.put(prototypeId,prototype);
    }

    /**
     * 将原型移除缓存
     * @param prototypeId
     */
    public synchronized static void removeCache(String prototypeId){
        cache.remove(prototypeId);
    }

    /**
     * 获取某个缓存原型对象
     * @param prototypeId
     * @return
     * @throws Exception
     */
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = cache.get(prototypeId);
        if (prototype==null) {
            throw new Exception("该缓存类型不存在已经或者已经被删除");
        }
        return prototype;
    }

}
