package com.ly.memento.memento;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.memento
 * @ClassName: Originator
 * @Author: lin
 * @Description: 原发器，使用备忘录来保存某个时刻原发器自身的状态，也可以使用备忘录来恢复内部状态
 * @Date: 2019-08-09 16:10
 * @Version: 1.0
 */
public class Originator {

    /**
     * 表示原发器的状态
     */
    private String state = "";

    /**
     * 创建保存原发器对象的备忘录对象那个
     * @return 保存的备忘录对象
     */
    public Memento createMemento() {
        return new MementoImpl (state);
    }

    /**
     * 重新设置原发器对象，让其回到备忘录对象记录的状态
     * @param memento 备忘录
     */
    public void setMemento(Memento memento){
        MementoImpl impl= (MementoImpl) memento;
        this.state = impl.getState ();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private static class MementoImpl implements Memento {
        /**
         * 需要保存的状态
         */
        private String state = "";

        public MementoImpl(String state) {
            this.state = state;
        }
        public String getState() {
            return state;
        }
    }
}
