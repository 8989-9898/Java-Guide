package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: MSIMainBoard
 * @Author: lin
 * @Description: 技嘉的主板实现
 * @Date: 2019-07-24 8:47
 * @Version: 1.0
 */
public class GAMainBoard implements MainBoardApi {

    /**
     * CPU 的插槽的孔数
     */
    private int cpuHoles;

    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("技嘉主板的实现，所需的 CPU 的孔槽数是：" + cpuHoles);
    }
}
