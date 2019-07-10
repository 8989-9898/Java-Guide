package com.ly.strategy;


import java.util.Scanner;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.strategy
 * @ClassName: CashMain
 * @Author: lin
 * @Description: 收银操作类
 * @Date: 2019-07-05 11:24
 * @Version: 1.0
 */
public class CashMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // strategy();
        strategyAndFactory();
    }

    private static void strategy() {
        System.out.print("请输入商品金额:");
        double numberA = scanner.nextDouble();
        System.out.print("请输入商品数量:");
        double numberB = scanner.nextDouble();
        System.out.print("请输入优惠策略（1.正常收费  2.打五折  3.满300减50 ）:");
        String operate = scanner.next();
        CashSuper cashSuper = null;
        switch (operate) {
            case "1":
                cashSuper = new CashNormal();
                break;
            case "3":
                cashSuper = new CashReturn(300, 50);
                break;
            case "2":
                cashSuper = new CashRebate(0.5);
                break;
            default:
                cashSuper = new CashNormal();
        }
        ContentCash cash = new ContentCash(cashSuper);
        double money = cash.getResult(numberA * numberB);
        System.out.println("商品金额是: " + numberA + " 商品数量是: " + numberB + " 总计收费:" + money);
    }

    private static void strategyAndFactory() {
        System.out.print("请输入商品金额:");
        double numberA = scanner.nextDouble();
        System.out.print("请输入商品数量:");
        double numberB = scanner.nextDouble();
        System.out.print("请输入优惠策略（1.正常收费  2.打五折  3.满300减50 ）:");
        String operate = scanner.next();
        ContentCash cash = new ContentCash(operate);
        double money = cash.getResult(numberA * numberB);
        System.out.println("商品金额是: " + numberA + " 商品数量是: " + numberB + " 总计收费:" + money);
    }
}
