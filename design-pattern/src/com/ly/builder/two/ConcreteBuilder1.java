package com.ly.builder.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.two
 * @ClassName: ConcreteBuilder1
 * @Author: lin
 * @Description: 定义具体的产品实现创建者
 * @Date: 2019-07-10 14:16
 * @Version: 1.0
 */
public class ConcreteBuilder1 extends Builder {
    private Product product=new Product();


    @Override
    public void BuildPartA() {
        product.add("生产产品的A部件");
    }

    @Override
    public void BuildPartB() {
        product.add("生产产品的B部件");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
