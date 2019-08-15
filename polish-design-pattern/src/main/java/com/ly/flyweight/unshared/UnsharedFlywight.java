package com.ly.flyweight.unshared;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.unshared
 * @ClassName: UnsharedFlywight
 * @Author: lin
 * @Description: 不需要共享的享元对象的实现，也是组合模式中的组合对象
 * @Date: 2019/8/10 20:44
 * @Version: 1.0
 */
public class UnsharedFlywight implements Flyweight{

    /**
     * 记录每个组合对象包含的子组件
     */
    private List<Flyweight> list=new ArrayList<>();



    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : list) {
            // 调用 AuthorizationFlyweight 的match方法进行判断 递归调用,可能包含下级
            if (flyweight.match(securityEntity,permit)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
        list.add(f);
    }
}
