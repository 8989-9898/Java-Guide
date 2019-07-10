package com.ly.facade.stock;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.facade.stock
 * @ClassName: Facade
 * @Author: lin
 * @Description: 外观模式类,为一组特定的接口或者方法提供一个一致的界面，次模式定义了一个更高级的接口或者方法，在这个接口中调用一系列的接口和方法来实现的功能
 *              这个接口使得这一子系统更加容易实现。
 * @Date: 2019-07-09 16:42
 * @Version: 1.0
 */
public class Facade {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt debt;
    private Realty realty;

    public Facade() {
        stock1=new Stock1();
        stock2=new Stock2();
        stock3=new Stock3();
        debt=new NationalDebt();
        realty=new Realty();
    }

    public void sell(){
        stock3.sell();
        stock1.sell();
        stock2.sell();
        debt.sell();
        realty.sell();
    }

    public void buy(){
        stock2.buy();
        stock1.buy();
        stock3.buy();
        debt.buy();
        realty.buy();
    }


}
