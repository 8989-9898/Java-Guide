package com.ly.facade.stock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.facade.stock
 * @ClassName: NationalDebt
 * @Author: lin
 * @Description: 基于外观模式的国债
 * @Date: 2019-07-09 16:39
 * @Version: 1.0
 */
public class NationalDebt {
    public void sell(){
        System.out.println("国债卖出");
    }
    public void buy(){
        System.out.println("国债买入");
    }
}
