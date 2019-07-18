package com.ly.simplefactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.pattern
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用简单工厂模式的客户端，不用知道具体的实现类是哪个
 * @Date: 2019-07-18 9:35
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.println("传入测试使用的数据");

        Api api1 = Factory.getApi();
        api1.println("使用配置文件的方式创建具体的类");
    }
}
