package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: AbstractFactory
 * @Author: lin
 * @Description: 定义组装电脑的抽象工厂接口
 * @Date: 2019-07-24 10:02
 * @Version: 1.0
 */
public interface AbstractFactory {


    /**
     * 创建具体的某种产品
     * @param type 选择参数
     * @return
     */
    public Object createProduct(int type);
}
