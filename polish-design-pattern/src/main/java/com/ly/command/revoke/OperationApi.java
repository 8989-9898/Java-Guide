package com.ly.command.revoke;

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
     * 设置开始计算的初始值
     */
    public void setResult(int result);

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

}
