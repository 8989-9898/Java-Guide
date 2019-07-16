package com.ly.visitor.person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: ObjectStructure
 * @Author: lin
 * @Description: 对象结构类
 * @Date: 2019-07-16 8:44
 * @Version: 1.0
 */
public class ObjectStructure {
    private List<Person> people=new ArrayList<>();

    public void attach(Person person){
        people.add(person);
    }

    public void detach(Person person){
        people.remove(person);
    }

    public void display(Action visitor){
        people.forEach((e)->e.accept(visitor));
    }
}
