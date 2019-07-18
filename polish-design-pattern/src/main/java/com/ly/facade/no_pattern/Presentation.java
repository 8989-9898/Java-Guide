package com.ly.facade.no_pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.facade
 * @ClassName: Presentation
 * @Author: lin
 * @Description: 代码生成器的表示层的生成类
 * @Date: 2019/7/18 21:13
 * @Version: 1.0
 */
public class Presentation {

    public void generate(){
        // 从配置管理类中获取配置类信息
        ConfigModel model = ConfigManager.getInstance().getModel();
        // 判断是否生成表示层代码
        if (model.isNeedGenPresentation()) {
            // 按照要求生成相应的代码，并保存成文件。
            System.out.println("代码生成器，生成表示层代码中");
        }
    }

}
