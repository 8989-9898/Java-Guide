package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.pattern
 * @ClassName: Schema1
 * @Author: lin
 * @Description: 定义装机方案二：AMD的CPU ＋ 微星的主板
 * @Date: 2019-07-24 10:04
 * @Version: 1.0
 */
public class Schema2 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object obj = null;
        if (type == 1) {
            obj = new AMDCPU(544);
        } else if (type == 2) {
            obj = new MSIMainBoard(544);
        }
        return obj;
    }
}
