package com.ly.memento.prototype;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.no.pattern
 * @ClassName: FlowAMockPrototype
 * @Author: lin
 * @Description: 模拟的运行流程，一个示意，代指某个流程
 * @Date: 2019-08-09 15:50
 * @Version: 1.0
 */
public class FlowAMockPrototype implements Cloneable {

    /**
     * 流程的名字
     */
    private String flowName;

    /**
     * 某个中间的结果，需要外部存储的数据
     */
    private int tempResult;
    /**
     * 某个中的结果，需要外部存储的状态数据
     */
    private String tempState;


    /**
     * 示意运行流程的第一个阶段
     */
    public void runPhaseOne() {
        // 在这个阶段可能产生的中间结果
        this.tempResult = 10;
        this.tempState = "PhaseOne";
        System.out.println ("第一段结束时的数据信息");
        System.out.println (tempState + " : now run " + tempResult);

    }

    /**
     * 示意，按照方案一来运行流程的后半段
     */
    public void schema1() {
        tempState += " schema1";
        tempResult += 11;
        System.out.println (tempState + " : now run " + tempResult);
    }

    /**
     * 示意，按照方案二来运行流程的后半段
     */
    public void schema2() {
        tempState += " schema2";
        tempResult -= 5;
        System.out.println (tempState + " : now run " + tempResult);
    }

    /**
     * 创建备忘录，将原发器的现有状态保存到备忘录对象中
     *
     * @return
     */
    public MementoImplPrototype createMemento() {
        try {
            return new MementoImplPrototype ((FlowAMockPrototype) this.clone ());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace ();
        }
        return null;
    }

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     *
     * @param memento
     */
    public void setMemento(FlowAMockMemento memento) {
        MementoImplPrototype impl = (MementoImplPrototype) memento;
        this.tempResult = impl.getPrototype ().getTempResult ();
        this.tempState = impl.getPrototype ().getTempState ();
    }

    /**
     * 真正的备忘录对象，实现在窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImplPrototype implements FlowAMockMemento {
        private FlowAMockPrototype prototype;

        public FlowAMockPrototype getPrototype() {
            return prototype;
        }

        public MementoImplPrototype(FlowAMockPrototype prototype) {
            this.prototype = prototype;
        }
    }

    public int getTempResult() {
        return tempResult;
    }

    public void setTempResult(int tempResult) {
        this.tempResult = tempResult;
    }

    public String getTempState() {
        return tempState;
    }

    public void setTempState(String tempState) {
        this.tempState = tempState;
    }

    public FlowAMockPrototype(String flowName) {
        this.flowName = flowName;
    }
}
