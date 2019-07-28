package com.ly.prototype.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.prototype.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用原型模式的事例
 * @Date: 2019/7/28 10:35
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        BusinessOrder businessOrder = new BusinessOrder();

        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderProductNum(7690);
        enterpriseOrder.setEnterpriseName("腾讯");
        enterpriseOrder.setProductId("P049");

        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(5690);
        personalOrder.setCustomerName("lisi");
        personalOrder.setProductId("P009");


        businessOrder.saveOrder(personalOrder);

        System.out.println("----------------------------------");
        businessOrder.saveOrder(enterpriseOrder);
    }

    /**
     * 一般在使用原型模式的时候使用的java 自带的 clone() 方法。此处自是表示
     * 原型模式的功能：一个是通过克隆来创建新的对象事例，一个是为克隆出来的对象复制原型实例属性的值。
     *
     * 原型模式的优点：
     *      对客户端隐藏具体的实现类型：原型模式的客户端只知道原型接口的类型，并不知道具体的实现类型，从而减少客户端
     *      对这些具体的实现类型的依赖
     *      在运行时动态改变具体的实现类型：原型模式在运行期间有客户端来注册具体的实现类型，也可以动态的改变类型
     *      ，看起来接口没有任何变化，但其实运行的已经是另一个类事例了。因为克隆一个原型就是实例化一个对象
     * 原型模式的缺点：
     *      原型模式的的缺点就在于每个原型的子类必须实现 clone 操作，尤其是在包含引用类型的对象的时候，clone 方法
     *      会比较麻烦，必须能够递归的让所有的相关对象都要正确的实现克隆。
     *
     * 原型模式的本质是：克隆生成的对象。
     * */
}
