package com.ly.builder.builder;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.builder
 * @ClassName: Director
 * @Author: lin
 * @Description: 生成器模式的指挥者，指挥具体的生成流程
 * @Date: 2019/7/27 15:23
 * @Version: 1.0
 */
public class Director {

    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 示意方法，指导生成器生成具体的产品对象
     */
    public void constract(){
        builder.builderPart();
    }
}
