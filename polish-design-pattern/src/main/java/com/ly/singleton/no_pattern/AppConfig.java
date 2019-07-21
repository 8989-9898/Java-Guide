package com.ly.singleton.no_pattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.singleton
 * @ClassName: AppConfig
 * @Author: lin
 * @Description: 读取配置文件的配置类
 * @Date: 2019/7/21 11:50
 * @Version: 1.0
 */
public class AppConfig {

    private String parameterA;
    private String parameterB;

    public AppConfig() {
        // 读取配置文件信息，进行参数配置
        config();
    }

    /**
     * 进行参数配置
     */
    private void config() {
        Properties properties = new Properties();
        InputStream nio = null;
        try {

            nio = this.getClass().getResourceAsStream("/singleton/AppConfig.properties");
            properties.load(nio);
            this.parameterA = properties.getProperty("paramA");
            this.parameterB = properties.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (nio!=null) {
                try {
                    nio.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "parameterA='" + parameterA + '\'' +
                ", parameterB='" + parameterB + '\'' +
                '}';
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }
}
