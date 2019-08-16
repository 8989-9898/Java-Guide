package com.ly.decorator.no.pattern;

import com.ly.proxy.proxy.Proxy;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.no.pattern
 * @ClassName: Price
 * @Author: lin
 * @Description: 奖金计算类
 * @Date: 2019-08-15 16:18
 * @Version: 1.0
 */
public class Price {

    /**
     * 计算某人在某段时间内的奖金，有些参数在演示中不会使用，但是在实际情况中式需要的，所以保留
     *
     * @param user  被计算奖金的人员
     * @param begin 计算奖金开始的时间
     * @param end   计算奖金结束的时间
     * @return 某人在某段时间内的奖金
     */
    public double calcPrice(String user, Date begin, Date end) {
        double price = 0.0;
        // 计算当月业务奖金，所有人都要计算
        price = this.monthPrice (user, begin, end);
        // 计算累计奖金
        price += this.sunPrice (user, begin, end);
        // 需要判断是普通人员和还是业务经理，只有业务经理有团队奖金
        if (this.isManager (user)) {
            price += this.groupPrice (user, begin, end);
        }
        return price;
    }

    /**
     * 计算当月业务奖金
     */
    private double monthPrice(String user, Date begin, Date end) {
        // 计算当月业务奖金，按照人员去获取当月的业务额，然后乘以 3%
        double price = DBCache.menoy.get (user) * 0.03;
        System.out.println (user + " 当月的业务奖金是：" + price);
        return price;
    }

    /**
     * 计算累计奖金
     */
    private double sunPrice(String user, Date begin, Date end) {
        // 按照人员去获取，每个人的 累计的业务额，进行计算，假设是 10000000
        double price = 10000000 * 0.001;
        System.out.println (user + " 的累计奖金是 ：" + price);
        return price;
    }

    /**
     * 判断当前人员是不是经理
     *
     * @param user
     * @return
     */
    private boolean isManager(String user) {
        // 只有  王五  是经理
        if ("王五".equals (user)) {
            return true;
        }
        return false;
    }

    /**
     * 计算团队奖金
     */
    private double groupPrice(String user, Date begin, Date end) {
        // 先计算出团队的总业务额，在乘以 1%
        double group = 0.0;
        for (Double value : DBCache.menoy.values ()) {
            group += value;
        }
        double price = group * 0.01;
        System.out.println (user + " 当月团队业务奖金是：" + price);
        return price;
    }
}
