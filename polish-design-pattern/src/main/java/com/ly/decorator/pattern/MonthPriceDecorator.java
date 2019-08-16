package com.ly.decorator.pattern;

import com.ly.decorator.no.pattern.DBCache;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: MonthPriceDecorator
 * @Author: lin
 * @Description: 装饰器对象，计算当月业务奖金
 * @Date: 2019-08-15 16:51
 * @Version: 1.0
 */
public class MonthPriceDecorator extends Decorator {

    public MonthPriceDecorator(Component component) {
        super (component);
    }

    @Override
    public double calcPrice(String user, Date begin, Date end) {
        // 先获取前面计算出来的奖金
        double price = super.calcPrice (user, begin, end);
        // 然后计算当月业务奖金   3%
        price += DBCache.menoy.get (user) * 0.03;
        System.out.println (user + " 当月的业务奖金是：" + price);
        return price;
    }
}
