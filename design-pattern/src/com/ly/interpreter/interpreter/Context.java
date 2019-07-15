package com.ly.interpreter.interpreter;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.interpreter.interpreter
 * @ClassName: Context
 * @Author: lin
 * @Description: 包含解析器之外的一些全局信息
 * @Date: 2019/7/15 21:39
 * @Version: 1.0
 */
public class Context {

    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "Context{" +
                "input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}
