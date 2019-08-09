package com.ly.memento.memento;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.memento
 * @ClassName: Caretaker
 * @Author: lin
 * @Description: 负责保存备忘录的对象
 * @Date: 2019-08-09 16:18
 * @Version: 1.0
 */
public class Caretaker {

    private Memento memento;

    public void saveMemento(Memento memento){
        this.memento=memento;
    }

    public Memento retriveMemento(){
        return this.memento;
    }
}
