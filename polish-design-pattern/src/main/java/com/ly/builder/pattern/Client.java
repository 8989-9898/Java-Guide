package com.ly.builder.pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.builder.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: ${DESCRIPTION}
 * @Date: 2019/7/27 15:13
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 添加测试数据
        ExportHanderModel header = new ExportHanderModel();
        header.setDepId("淘宝");
        header.setExportDate("2019-07-27 15:20:30");

        Map<String, Collection<ExportDataModel>> datas = new HashMap<>();
        Collection<ExportDataModel> bodys = new ArrayList<>();
        bodys.add(new ExportDataModel("03", 90, 40));
        bodys.add(new ExportDataModel("04", 40, 50));
        datas.put("抢购订单表", bodys);

        ExportFooterModel footer = new ExportFooterModel();
        footer.setExportUser("李四");

        Builder txt = new BuilderTxt();
        Director director=new Director(txt);
        System.out.println(director.construct(footer,datas,header));
        System.out.println("=========================");

        director=new Director(new BuilderXml());
        System.out.println(director.construct(footer,datas,header));

    }

    /**
     * 构建者模式的优点：
     *      松散耦合：构建者模式可以用在一个构建算法构建出表现上完全不同的产品，实现产品构建和
     *      产品表现上的分离。构建器模式正是把产品构建的过程独立出来，使它具体的产品表现松散耦合
     *      ，从而使得构建算法可以复用，而具体的产品表现也可以灵活地、方便地扩展和切换
     *
     *      可以容易的改变产品的内部表示： 在构建者模式中，由于Builder对象只是提供接口给Director
     *      使用，那么具体的创建和装配方式是被Builder接口隐藏的，Director并不知道这些具体的实现细节，
     *      在想要改变产品的内部时，只需要修改产品的Builder实现即可。
     *
     *      更好的复用性： 构建者模式很好地实现了构建算法和具体产品实现的分离。这样一来，使得构建产品的
     *      算法可以复用。同样的道理，具体的产品实现也可以复用，同一产品的实现，可以配合不同的构建算法使用。
     *
     * 构建者模式的本质：分离整体的构建算法和部件构造。
     *
     * 构建者模式的重心还是在于返利整体构建算法和部件构造，而分步骤构建对象不过时整体构建算法的一个简单表现，
     * 或者说是一个福袋产物。
     * */
}
