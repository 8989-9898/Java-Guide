package com.ly.memento.no.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用模式的工作流程实例
 * @Date: 2019-08-09 15:49
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock ("测试工作流程");
        // 运行流程的第一段
        mock.runPhaseOne ();

        // 将第一段运行的数据保存下来，在多种不同的后面的流程使用
        int tempResult = mock.getTempResult ();
        String tempState = mock.getTempState ();
        // 先使用第一种运行方式
        mock.schema1 ();

        // 将数据信息还原，进行第二种运行方式
        mock.setTempResult (tempResult);
        mock.setTempState (tempState);
        mock.schema2 ();
    }
}
