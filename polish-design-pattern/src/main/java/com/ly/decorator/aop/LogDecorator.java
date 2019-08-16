package com.ly.decorator.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.aop
 * @ClassName: LogDecorator
 * @Author: lin
 * @Description: 实现记录日志的装饰器
 * @Date: 2019-08-16 10:04
 * @Version: 1.0
 */
public class LogDecorator extends Decorator {
    public LogDecorator(GoodsSaleEbi ebi) {
        super (ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleModel model) {
        // 在执行功能后记录日志
        boolean b = this.ebi.sale (user, customer, model);
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println ("日志记录：" + format.format (new Date ()) + "时" + user + "保存了一条销售记录，客户是：" + customer + ",购买记录是：" + model);
        return b;
    }
}
