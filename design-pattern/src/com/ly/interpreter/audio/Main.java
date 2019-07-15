package com.ly.interpreter.audio;

import javax.xml.bind.Element;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.audio
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019/7/15 22:05
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        System.out.println("上海滩");
        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        AbstractExpresion expresion = null;
        while (context.getText().length() > 0) {
            String str = context.getText().substring(0, 1);
            switch (str) {
                case "O":
                    expresion = new Scala();
                    break;
                case "T":
                    expresion = new Speed();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "A":
                case "B":
                case "P":
                    expresion=new Note();
                    break;
            }
            expresion.interpreter(context);
        }
    }
}
