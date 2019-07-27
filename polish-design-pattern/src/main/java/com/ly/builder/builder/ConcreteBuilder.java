package com.ly.builder.builder;


/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.builder
 * @ClassName: ConcreteBuilder
 * @Author: lin
 * @Description: 具体的某种生成器实现
 * @Date: 2019/7/27 15:52
 * @Version: 1.0
 */
public class ConcreteBuilder implements Builder{

    private Product product;

    public ConcreteBuilder(Product product) {
        this.product = product;
    }

    @Override
    public void builderPart() {
        // 调用具体的某个部件的构建能力
        product.test();
    }

    public Product getProduct() {
        return product;
    }


}
