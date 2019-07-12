package com.ly.iterator;

import com.ly.observer.two.ConcreteSubject;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator
 * @ClassName: ConcreteIterator
 * @Author: lin
 * @Description: 具体的迭代器
 * @Date: 2019-07-12 17:06
 * @Version: 1.0
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate = null;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
    }


    @Override
    public Object first() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object next() {
        Object rel = null;
        if (aggregate.getCount() > current) {
            rel = aggregate.getItems().get(current);
        }
        current++;
        return rel;
    }

    @Override
    public boolean isDone() {
        return aggregate.getCount() <= current ? true : false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.get(current);
    }
}
