package com.ly.adapter.nba;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.adapter.nba
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 16:22
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Forwards forwards = new Forwards("科比");
        forwards.attack();
        Guards guards = new Guards("乔丹");
        guards.attack();
        Translator translator = new Translator("姚明");
        translator.attack();
        translator.defense();
    }
}
