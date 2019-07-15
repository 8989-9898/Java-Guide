package com.ly.interpreter.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.interpreter
 * @ClassName: Main
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/15 21:45
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpresion> list=new ArrayList<>();
        list.add(new TerminalExpresion());
        list.add(new NonterminalExpresion());
        list.add(new TerminalExpresion());
        list.add(new TerminalExpresion());

        list.forEach((e)->e.interpreter(context));
    }
}
