package com.ly.memento.command;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.revoke
 * @ClassName: OperationApi
 * @Author: lin
 * @Description: 定义计算接口只有加减计算（接受者）
 * @Date: 2019/8/3 10:59
 * @Version: 1.0
 */
public interface OperationApi {

    /**
     * 获取计算结果
     * @return
     */
    public int getResult();

    /**
     * 加法
     * @param num 需要加的数
     */
    public void add(int num);

    /**
     * 减法
     * @param num 需要减的数
     */
    public void substract(int num);

    /**
     * 创建保存原发器对象的备忘录对象
     * @return
     */
    public Memento createMemento();

    /**
     * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
     * @param m
     */
    public void setMemento(Memento m);

}
