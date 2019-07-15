package com.ly.interpreter.interpreter;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.interpreter
 * @ClassName: TerminalExpresion
 * @Author: lin
 * @Description: 终结符表达式
 * @Date: 2019/7/15 21:42
 * @Version: 1.0
 */
public class TerminalExpresion extends AbstractExpresion{
    @Override
    public void interpreter(Context context) {
        System.out.println("终结符表达式："+context);
    }
}
