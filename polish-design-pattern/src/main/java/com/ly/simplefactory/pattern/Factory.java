package com.ly.simplefactory.pattern;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.pattern
 * @ClassName: Factory
 * @Author: lin
 * @Description: 创建具体接口实现对象的简单工厂
 * 简单工厂也可以用来创建 抽象类和普通的类
 * 简单工厂的方法通常都是静态的，不需要由客户端去创建简单工厂的对象
 * 简单工厂又称为万能工厂，应为在工厂中可以包含多个穿件的方法，用于创建不同的接口、抽象类或者普通类
 * 简单工厂虽然什么都可以创建，但是对于简单工厂可以创建对象的范围不要太大，也就是一个组件或者模块的工厂就可以了
 * @Date: 2019-07-18 9:18
 * @Version: 1.0
 */
public class Factory {

    /**
     * 创建具体Api的方法
     *
     * @param condition 选择条件
     * @return 创建好的 Api 对象
     */
    public static Api createApi(int condition) {
        /**
         * 应该根据某些条件去选择的创建一个具体的对象
         * 这些条件可以从外部传入，从配置文件中获取判断的值或者来源于程序运行期间的某个值，比如从缓存中、数据库中
         * 如果只有一个实现，可以省略条件，直接返回
         */
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }
        return api;
    }

    /**
     * 使用配置文件获取具体获取具体生成的类实例
     * 通反射获取
     *
     * @return
     */
    public static Api getApi() {
        // 直接读取配置文件来获取需要创建的类
        Properties p = new Properties();
        InputStream in = null;
        try {
            URL resource = Factory.class.getResource("/Factory.properties");
            System.out.println(resource);
            //in = new FileInputStream("Factory.properties");
            in=Factory.class.getResourceAsStream("/Factory.properties");
            p.load(in);
        } catch (IOException e) {
            System.out.print("装配工厂配置文件出错：");
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Api api = null;
        try {
            // 利用反射创建对象
            api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
