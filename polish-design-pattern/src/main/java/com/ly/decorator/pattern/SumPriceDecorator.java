package com.ly.decorator.pattern;

import com.ly.decorator.no.pattern.DBCache;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: MonthPriceDecorator
 * @Author: lin
 * @Description: 装饰器对象，计算累计奖金
 * @Date: 2019-08-15 16:51
 * @Version: 1.0
 */
public class SumPriceDecorator extends Decorator {

    public SumPriceDecorator(Component component) {
        super (component);
    }

    @Override
    public double calcPrice(String user, Date begin, Date end) {
        // 先获取前面计算出来的奖金
        double price = super.calcPrice (user, begin, end);
        // 按照人员去获取，每个人的 累计的业务额，进行计算，假设是 10000000
        price += 10000000 * 0.001;
        System.out.println (user + " 的累计奖金是 ：" + price);
        return price;
    }
}
