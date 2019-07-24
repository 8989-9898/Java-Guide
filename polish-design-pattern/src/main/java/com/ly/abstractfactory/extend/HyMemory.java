package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.extend
 * @ClassName: HyMemory
 * @Author: lin
 * @Description: 现代的内存实现类
 * @Date: 2019-07-24 10:31
 * @Version: 1.0
 */
public class HyMemory implements MemoryApi {
    @Override
    public void cacheData() {
        System.out.println("现在使用 现代 的内存进行组装测试");
    }
}
