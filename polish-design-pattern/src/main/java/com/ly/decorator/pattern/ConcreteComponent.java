package com.ly.decorator.pattern;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: ConcreteComponent
 * @Author: lin
 * @Description: 基本的奖金计算类，也是被装饰的对象
 * @Date: 2019-08-15 16:47
 * @Version: 1.0
 */
public class ConcreteComponent extends Component {
    @Override
    public double calcPrice(String user, Date begin, Date end) {
        // 只有一个默认的实现，没有奖金
        return 0;
    }
}
