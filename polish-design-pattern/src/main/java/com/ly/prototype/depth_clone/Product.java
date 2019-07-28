package com.ly.prototype.depth_clone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.depth_clone
 * @ClassName: Product
 * @Author: lin
 * @Description: 产品对象，同时实现自己定义的克隆和java的克隆
 * @Date: 2019/7/28 11:23
 * @Version: 1.0
 */
public class Product implements ProductPrototype,Cloneable{

    private String productId;
    private String name;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 使用 java的克隆方法
        return super.clone();
    }

    @Override
    public ProductPrototype cloneProduct() {
        // 自定义的克隆方法，创建对象将属性值赋予新建的对象
        Product prototype = new Product();
        prototype.setName(this.name);
        prototype.setProductId(this.productId);
        return prototype;
    }
}
