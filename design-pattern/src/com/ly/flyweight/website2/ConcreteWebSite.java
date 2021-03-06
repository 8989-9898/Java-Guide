package com.ly.flyweight.website2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.website2
 * @ClassName: ConcreteWebSite
 * @Author: lin
 * @Description: 具体的享元网站类
 * @Date: 2019/7/15 21:17
 * @Version: 1.0
 */
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类:" + name + " 用户：" + user.getName());
    }
}
