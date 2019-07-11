package com.ly.abstractfactory.abstractfactory;

import com.ly.abstractfactory.Department;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.factorymethod
 * @ClassName: Main
 * @Author: lin
 * @Description: 使用抽象工厂模式
 *                  提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 *                  优点是，已于交换产品系列，如我们需要将 mysql 的数据源修改为 oracle 的数据源，只需要将 new MySqlFactory(); 换为 factory.createDepartment(); 即可
 *                  具体的创建实例的过程与客户端分离，客户端是通过它们的接口和抽象类来操作实例的。
 *                  缺点是，在添加一个表时 需要添加三个类 如 IDepartment、OracleDepartment、MySqlDepartment 和修改 Factory、MySqlFactory、OracleFactory才能实现，
 *                  而且在 客户端不可能只有一个， 如果我们有一百个 客户端 使用的是 MySQL的数据源（Factory factory=new MySqlFactory();），
 *                  需要修改为 oracle 的数据源（Factory factory=new OracleFactory();）就需要修改 100 次
 * @Date: 2019-07-11 10:41
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Factory factory=new MySqlFactory();
        IDepartment department = factory.createDepartment();
        System.out.println(department.getDepartment());
        department.insert(new Department(1,"人事部"));
        factory=new OracleFactory();
        department=factory.createDepartment();
        System.out.println(department.getDepartment());
        department.insert(new Department(4,"技术部"));
    }
}
