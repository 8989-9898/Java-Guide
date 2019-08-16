package com.ly.decorator.pattern;

import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: Decorator
 * @Author: lin
 * @Description: 装饰器的接口，需要和被装饰的对象实现同样的接口
 * @Date: 2019-08-15 16:49
 * @Version: 1.0
 */
public class Decorator extends Component {

    /**
     * 持有被装饰的组件对象
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrice(String user, Date begin, Date end) {
        // 转调组件对象的方法
        return component.calcPrice (user,begin,end);
    }
}
