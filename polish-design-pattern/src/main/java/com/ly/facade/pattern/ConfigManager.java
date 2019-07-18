package com.ly.facade.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.facade
 * @ClassName: ConfigManager
 * @Author: lin
 * @Description: 代码生成器的示意配置管理类，负责读取配置文件
 *               并将配置文件中的内容配置到 配置类 ConfigModel 中去
 * @Date: 2019/7/18 21:05
 * @Version: 1.0
 */
public class ConfigManager {
    private static ConfigManager manager=null;
    private static ConfigModel model=null;

    /**
     * 将配置管理类设置为单列，私有化构造方法
     */
    private ConfigManager(){}

    /**
     * 创建配置管理类的初始化方法，同时生成配置类的对象
     * @return
     */
    public static ConfigManager getInstance(){
        if (manager==null) {
            manager=new ConfigManager();
            model=new ConfigModel();
            // 在这里进行读取配置文件，为了演示不进行读取
        }
        return manager;
    }

    /**
     * 获取配置类
     * @return
     */
    public ConfigModel getModel(){
        return model;
    }
}
