package com.ly.facade.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.facade.pattern
 * @ClassName: Facade
 * @Author: lin
 * @Description: 代码生成器子系统的外观类
 * @Date: 2019/7/18 21:47
 * @Version: 1.0
 */
public class Facade {

    /**
     * 客户端需要的，一个简单的胆码生成功能调用
     */
    public void generate(){
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }

}
