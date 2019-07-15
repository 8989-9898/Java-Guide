package com.ly.interpreter.audio;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.audio
 * @ClassName: Speed
 * @Author: lin
 * @Description: 音速类
 * @Date: 2019/7/15 22:21
 * @Version: 1.0
 */
public class Speed extends AbstractExpresion {
    @Override
    public void excute(String key, Double value) {
        String speed = "";
        if (500 > value) {
            speed = "快速";
        } else if (1000 >= value) {
            speed = "慢速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
