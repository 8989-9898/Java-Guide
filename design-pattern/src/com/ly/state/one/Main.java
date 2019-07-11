package com.ly.state.one;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.one
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-11 14:56
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHours(10);
        work.wirteProgram();
        work.setHours(11);
        work.wirteProgram();
        work.setHours(12);
        work.wirteProgram();
        work.setHours(13);
        work.wirteProgram();
        work.setHours(14);
        work.wirteProgram();
        work.setHours(15);
        work.wirteProgram();
        work.setHours(17);
        work.setTaskFinish(false);
        work.wirteProgram();
        work.setHours(20);
        work.wirteProgram();
        work.setHours(23);
        work.wirteProgram();

    }
}
