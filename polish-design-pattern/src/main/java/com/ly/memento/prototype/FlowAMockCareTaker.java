package com.ly.memento.prototype;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.pattern
 * @ClassName: FlowAMockCareTaker
 * @Author: lin
 * @Description: 负责保存模拟运行流程的备忘录对象
 * @Date: 2019-08-09 16:36
 * @Version: 1.0
 */
public class FlowAMockCareTaker {

    private FlowAMockMemento memento;

    public void saveMemento(FlowAMockMemento memento){
        this.memento=memento;
    }

    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
