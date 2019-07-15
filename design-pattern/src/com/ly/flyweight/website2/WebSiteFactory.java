package com.ly.flyweight.website2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.website2
 * @ClassName: WebSiteFactory
 * @Author: lin
 * @Description: 网站工厂
 * @Date: 2019/7/15 21:19
 * @Version: 1.0
 */
public class WebSiteFactory {

    private Map<String, WebSite> map = new HashMap<>();

    public WebSite getWebSite(String key) {
        WebSite site = map.get(key);
        // 判断是否存在该对象，存在直接返回，不存在则创建一个在返回
        if (site == null) {
            site = new ConcreteWebSite(key);
            map.put(key, site);
        }
        return site;
    }

    /**
     * 获得网站分类总数
     * @return
     */
    public int getWebSiteCount(){
        return this.map.size();
    }

}
