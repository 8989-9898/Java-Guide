package com.ly.interpreter.audio;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.audio
 * @ClassName: Note
 * @Author: lin
 * @Description: 音符类
 * @Date: 2019/7/15 21:56
 * @Version: 1.0
 */
public class Note extends AbstractExpresion {
    @Override
    public void excute(String key, Double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(note+" ");
    }
}
