package com.ly.decorator.aop;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用装饰模式实现AOP功能
 * @Date: 2019-08-16 9:51
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 组合装饰器
        GoodsSaleEbi ebi=new CheckDecorator (new LogDecorator (new GoodsSaleEbo ()));
        SaleModel model = new SaleModel ("外星人笔记本", 23);
        ebi.sale ("王五","张三",model);
        ebi.sale ("赵六","李四",model);

    }
}
