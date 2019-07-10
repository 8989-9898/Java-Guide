package com.ly.facade.stock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.facade.stock
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-09 16:48
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.buy();
        facade.sell();
    }
}
