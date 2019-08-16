package com.ly.decorator.pattern;

import com.ly.decorator.no.pattern.DBCache;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: MonthPriceDecorator
 * @Author: lin
 * @Description: 装饰器对象，计算团队奖金
 * @Date: 2019-08-15 16:51
 * @Version: 1.0
 */
public class GroupPriceDecorator extends Decorator {

    public GroupPriceDecorator(Component component) {
        super (component);
    }

    @Override
    public double calcPrice(String user, Date begin, Date end) {
        // 先获取前面计算出来的奖金
        double price = super.calcPrice (user, begin, end);
        // 先计算出团队的总业务额，在乘以 1%
        double group = 0.0;
        for (Double value : DBCache.menoy.values ()) {
            group += value;
        }
        price += group * 0.01;
        System.out.println (user + " 当月团队业务奖金是：" + price);
        return price;
    }
}
