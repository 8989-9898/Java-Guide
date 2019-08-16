package com.ly.decorator.aop;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: Decorator
 * @Author: lin
 * @Description: 定义装饰器的接口，需要实现与备装饰对象相同的接口
 * @Date: 2019-08-16 9:59
 * @Version: 1.0
 */
public abstract class Decorator implements GoodsSaleEbi {

    protected GoodsSaleEbi ebi;

    public Decorator(GoodsSaleEbi ebi) {
        this.ebi = ebi;
    }
}
