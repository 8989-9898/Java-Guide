package com.ly.interpreter.audio;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.audio
 * @ClassName: Scala
 * @Author: lin
 * @Description: 音量类
 * @Date: 2019/7/15 22:01
 * @Version: 1.0
 */
public class Scala extends AbstractExpresion {

    @Override
    public void excute(String key, Double value) {
        String scala = "";
        switch (value.intValue()) {
            case 1:
                scala = "低音";
                break;
            case 2:
                scala = "中音";
                break;
            case 3:
                scala = "高音";
                break;
        }
        System.out.print(scala+" ");
    }
}
