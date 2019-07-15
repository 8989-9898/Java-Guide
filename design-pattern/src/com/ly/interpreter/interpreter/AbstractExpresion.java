package com.ly.interpreter.interpreter;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.interpreter
 * @ClassName: AbstractExpresion
 * @Author: lin
 * @Description: 抽象表达式，申明一个抽象的解析操作
 * @Date: 2019/7/15 21:38
 * @Version: 1.0
 */
public abstract class AbstractExpresion {

    public abstract void interpreter(Context context);
}
