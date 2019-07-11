package com.ly.state.state;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.state
 * @ClassName: Main
 * @Author: lin
 * @Description: 
 * @Date: 2019-07-11 15:27
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHours(10);
        work.writeProgram();
        work.setHours(11);
        work.writeProgram();
        work.setHours(12);
        work.writeProgram();
        work.setHours(13);
        work.writeProgram();
        work.setHours(14);
        work.writeProgram();
        work.setHours(15);
        work.writeProgram();
        work.setHours(17);
        work.setTaskFinish(true);
        work.writeProgram();
        work.setHours(20);
        work.writeProgram();
        work.setHours(23);
        work.writeProgram();
    }
}
