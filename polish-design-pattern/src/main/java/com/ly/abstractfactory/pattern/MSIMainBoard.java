package com.ly.abstractfactory.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: MSIMainBoard
 * @Author: lin
 * @Description: 微星的主板实现
 * @Date: 2019-07-24 8:47
 * @Version: 1.0
 */
public class MSIMainBoard implements MainBoardApi {

    /**
     * CPU 的插槽的孔数
     */
    private int cpuHoles;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("微星主板的实现，所需的 CPU 的孔槽数是：" + cpuHoles);
    }
}
