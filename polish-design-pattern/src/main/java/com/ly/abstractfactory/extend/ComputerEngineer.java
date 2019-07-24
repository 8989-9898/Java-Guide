package com.ly.abstractfactory.extend;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: ComputerEngineer
 * @Author: lin
 * @Description: 装机工程师类
 * @Date: 2019-07-24 9:02
 * @Version: 1.0
 */
public class ComputerEngineer {

    /**
     * 装机所需的 cpu
     */
    private CPUApi cpu = null;

    /**
     * 装机所需的 主板
     */
    private MainBoardApi mainBoard = null;

    /**
     * 装机所需的 内存（新添加）
     */
    private MemoryApi memory = null;

    /**
     * 装机方法
     *
     * @param schema 具体选择的装机类型
     */
    public void makeComputer(AbstractFactory schema) {
        // 首先准备好装机所需的配件
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        // 在这里去获取 CPU 和主板的具体实现，通过工厂获取
        // 这种方式存在不安全，因为有可能创建不存在的对象，导致报错
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainBoard = (MainBoardApi) schema.createProduct(2);
        this.memory = (MemoryApi) schema.createProduct(3);

        // 测试是否装配成功
        this.cpu.calculate();
        this.mainBoard.installCPU();
        // 判断是否是方案三，选择的内存
        if (this.memory != null) {
            memory.cacheData();
        }
    }
}
