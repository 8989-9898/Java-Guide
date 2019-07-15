package com.ly.flyweight.website2;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.website2
 * @ClassName: Main
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/15 21:22
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite site1 = factory.getWebSite("个人网站");
        WebSite site2 = factory.getWebSite("个人网站");
        WebSite site3 = factory.getWebSite("个人网站");

        site1.use(new User("小张"));
        site2.use(new User("李四"));
        site3.use(new User("李斯"));

        WebSite site4 = factory.getWebSite("商业网站");
        WebSite site5 = factory.getWebSite("博客");
        WebSite site6 = factory.getWebSite("管理平台");

        site4.use(new User("王五"));
        site5.use(new User("王五"));
        site6.use(new User("王五"));
        System.out.println("网站分类总数是："+factory.getWebSiteCount());

    }
}
