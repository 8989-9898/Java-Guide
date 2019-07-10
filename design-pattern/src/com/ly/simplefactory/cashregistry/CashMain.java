package com.ly.simplefactory.cashregistry;


import java.util.Scanner;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.simplefactory.cashregistry
 * @ClassName: CashMain
 * @Author: lin
 * @Description: 收银操作类
 * @Date: 2019-07-05 11:24
 * @Version: 1.0
 */
public class CashMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商品金额:");
        double numberA = scanner.nextDouble();
        System.out.print("请输入商品数量:");
        double numberB = scanner.nextDouble();
        System.out.print("请输入优惠策略（1.正常收费  2.打五折  3.满300减50 ）:");
        String operate = scanner.next();
        CashSuper cashSuper = CashFactory.newInstance(operate);
        double money = cashSuper.acceptCash(numberA * numberB);
        System.out.println("商品金额是: "+numberA+" 商品数量是: "+numberB+" 总计收费:"+money);
    }
}
