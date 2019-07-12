package com.ly.iterator;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator
 * @ClassName: ConcreteIterator
 * @Author: lin
 * @Description: 具体的迭代器从后往前遍历
 * @Date: 2019-07-12 17:06
 * @Version: 1.0
 */
public class ConcreteIteratorDesc implements Iterator {
    private ConcreteAggregate aggregate = null;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
        this.current = concreteAggregate.getCount() - 1;
    }


    @Override
    public Object first() {
        return aggregate.getItems().get(aggregate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object rel = null;
        if (current >= 0) {
            rel = aggregate.getItems().get(current);
        }
        current--;
        return rel;
    }

    @Override
    public boolean isDone() {
        return current >= 0 ? true : false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.get(current);
    }
}
