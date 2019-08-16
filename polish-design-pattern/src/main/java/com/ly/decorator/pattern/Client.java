package com.ly.decorator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用装饰模式的奖金计算类
 * @Date: 2019-08-15 16:43
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 先创建计算基本奖金的类，这也是被装饰的类
        Component component = new ConcreteComponent ();
        // 然后对基本奖金进行装饰，这里要组合各个装饰，各个装饰者之间最好不要有先后顺序

        // 先进行普通人员的计算
        Decorator month = new MonthPriceDecorator (component);
        Decorator sum = new SumPriceDecorator (month);

        double money = sum.calcPrice ("张三", null, null);
        System.out.println ("=============>张三的奖金是：" + money);
        money = sum.calcPrice ("李四", null, null);
        System.out.println ("=============>李四的奖金是：" + money);
        money = sum.calcPrice ("赵六", null, null);
        System.out.println ("=============>赵六的奖金是：" + money);

        // 计算团队奖金，只有经理有
        Decorator group=new GroupPriceDecorator (sum);
        money = group.calcPrice ("王五", null, null);
        System.out.println ("=============>王五的奖金是：" + money);
    }


    /**
     * 装饰模式的优点：
     *      比继承更灵活：从为对象添加功能的角度来看，装饰模式比继承更灵活。继承是静态的，而且一旦继承所有子类的功能都是一样的
     *      。而装饰模式将功能分离到每个装饰器当中，通过对象组合的方式，在运行期间动态组合功能，每个被装饰的对象都有哪些功能，
     *      是由运行期间动态组合的来决定的。
     *      更容易复用功能：装饰模式把一系列复杂的功能分散到每个装饰器中实现，一般一个装饰器只实现一个功能，使实现装饰器变得更
     *      简单，更重要的是有利于功能的复用，可以给同一个对象添加多个同样的装饰器，也可以把一个装饰器用来装饰不同的对象，从而
     *      实现复用装饰器的功能。
     *      简化高层定义：装饰模式可以通过组合装饰器的方式，为对象添加任意多的功能。因此在高层定义的时候，不用把所有功能定义出
     *      来，而是定义最基本的就可以了，可以在需要的时候，组合相应的装饰器来完成相应的功能。
     *
     *
     * 装饰模式的缺点是：
     *      会产生很多的细粒度对象：装饰模式是把一系列复杂的功能，分散到每个装饰器中，一般一个装饰器只实现一个功能，这样会产生
     *      很多的细粒度的对象，而功能越复杂，产生的细粒度的对象就越多。
     *
     * 装饰模式的本质是：动态组合。
     *
     * */
}
