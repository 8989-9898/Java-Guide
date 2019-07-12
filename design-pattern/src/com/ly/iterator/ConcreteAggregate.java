package com.ly.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterator
 * @ClassName: ConcreteAggregate
 * @Author: lin
 * @Description: 定义具体的聚集对象
 * @Date: 2019-07-12 16:56
 * @Version: 1.0
 */
public class ConcreteAggregate extends Aggregate {

    public List<Object> getItems() {
        return items;
    }

    private List<Object> items=new ArrayList<>();

    public int getCount(){
        return items.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(Object object){
        items.add(object);
    }

}
