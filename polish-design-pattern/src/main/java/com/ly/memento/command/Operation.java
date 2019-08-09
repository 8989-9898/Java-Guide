package com.ly.memento.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: Operation
 * @Author: lin
 * @Description: 具体的算法算类（具体的接受者）
 * @Date: 2019/8/3 11:03
 * @Version: 1.0
 */
public class Operation implements OperationApi {

    /**
     * 运算结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        return new MementoImpl (this.result);
    }

    @Override
    public void setMemento(Memento m) {
        MementoImpl impl = (MementoImpl) m;
        result = impl.getResult ();
    }

    /**
     * 备忘录对象
     */
    private static class MementoImpl implements Memento {
        private Integer result;

        public MementoImpl(Integer result) {
            this.result = result;
        }

        public Integer getResult() {
            return result;
        }
    }
}
