package com.ly.decorator.pattern;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: Component
 * @Author: lin
 * @Description: 计算奖金的组件接口
 * @Date: 2019-08-15 16:46
 * @Version: 1.0
 */
public abstract class Component {
    /**
     * 计算某人在某段时间内的奖金，有些参数在演示中不会使用，但是在实际情况中式需要的，所以保留
     *
     * @param user  被计算奖金的人员
     * @param begin 计算奖金开始的时间
     * @param end   计算奖金结束的时间
     * @return 某人在某段时间内的奖金
     */
    public abstract double calcPrice(String user, Date begin, Date end);
}
