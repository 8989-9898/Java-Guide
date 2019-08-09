package com.ly.memento.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试使用备忘录模式的工作流程
 * @Date: 2019-08-09 16:38
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock ("测试工作流程");
        // 运行流程的第一段
        mock.runPhaseOne ();

        // 创建备忘录管理对象，将第一段运行的数据保存到备忘录，在多种不同的后面的流程使用
        FlowAMockCareTaker taker = new FlowAMockCareTaker ();
        taker.saveMemento (mock.createMemento ());
        // 先使用第一种运行方式
        mock.schema1 ();

        // 将数据信息还原，进行第二种运行方式
        mock.setMemento (taker.retriveMemento ());
        mock.schema2 ();
    }
}
