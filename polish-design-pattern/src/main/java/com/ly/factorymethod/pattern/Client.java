package com.ly.factorymethod.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.factorymethod.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用工厂方法模式实现的文件导出功能
 * @Date: 2019-07-23 16:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 使用工厂方法模式，只需要具体的工厂方法和具体的工厂方法子类即可，切换也很简单，只需要换具体的工厂方法子类
        // ExportOperate operate=new ExportSqlFileOperate();
        ExportOperate operate=new ExportTxtFileOperate();
        operate.export("使用工厂方法模式实现的文件导出功能");
    }

    /**
     * 工厂方法模式的主要功能是 让父类在不知道具体的实现的情况下，完成自身的功能调用；而具体的实现延伸到子类中实现
     *
     * 工厂方法的实现中，父类通常是一个抽象类，里面包含创建所需对象的抽象方法，这些抽象方法就是工厂方法
     *
     * 在工厂方法中子类在实现这些抽象方法时，通常并不是由子类来实现具体的功能，子类只是做一个功能的选择而已。
     *
     * 工厂方法模式的本质：延伸到子类来选择实现
     *
     * 工厂方法模式的优点：
     *     1、可以在不知道具体的实现下编程。
     *          工厂方法模式可以让你在实现功能的时候，如果需要某个产品对象，只需要使用产品的接口即可，而无需关心具体的实现，
     *     选择具体的实现的任务延伸到子类去完成
     *     2、更容易扩展对象的版本。
     *          工厂方法给子类提供了一个挂钩（钩子方法），使得扩展新的对象版本变得非常容易，（如：parameter 包中的 XML 格式的实现）
     * 工厂方法模式的优点：
     *      具体的产品对象和工厂方法的耦合性。在工厂方法模式中，工厂方法是创建具体的产品对象的，也就是需要选择具体的产品对象，并创建他们的实例，
     *      因此工厂方法和具体的产品对象是耦合的。
     * */
}
