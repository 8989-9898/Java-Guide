package com.ly.proxy.pattern;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用代理模式的事例（虚代理）
 * @Date: 2019/7/30 22:15
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserManager manager = new UserManager();
        List<UserModelApi> users = manager.getUserByDeptId("0102");
        System.out.println("不访全部数据时");
        users.forEach((e)->{
            System.out.println("用户编号："+e.getUserId()+",用户姓名："+e.getName());
            System.out.println(e);
        });

        System.out.println("访全部数据时");
        users.forEach((e)->{
            System.out.println("用户编号："+e.getUserId()+",用户姓名："+e.getName()+",用户性别："+e.getSex());
            System.out.println(e);
        });
    }

    /**
     * 这样的虚代理操作就是典型的以时间换空间的操作
     * 如果查询每条数据的全部信息就会存在 1+N 次的查询
     *
     * 代理模式的功能是通过创建一个创建一个代理对象，通过这个代理对象代表真实的对象，在代理对象调用真实的对象来实现功能。
     *
     * 代理的分类：
     *      虚代理：根据需要来创建开销很大的对象，该对象自有在需要的时候才会真正的创建。
     *      远程代理：用来在不同地址空间上代表同一个对象，这个不同的地址空间可以在本机，也可以在别的机器上。在Java里面就是典型的RMI技术。
     *      copy-on-write代理:在客户端操作的时候，只有对象确实的改变了，才会真的拷贝（或克隆）一个目标对象。算是虚代理的一个分支。
     *      保护代理：控制对原始对象的访问，如果有需要，可以给不同的用户提供不同的访问权限，以控制他们对原始对象的访问。
     *      Cache代理：为哪些昂贵的操作结果提供临时的存储空间，以便多个客户端可以共享这些结果。
     *      防火墙代理：保护对象不被恶意用户访问和操作。
     *      同步代理：使多个用户能够同时访问目标对象而没有冲突。
     *      智能代理：在访问对象时执行一写附加的操作，比如：对指向实际的对象的引用计数、第一次引用一个持久对象时，将它装入内存等。
     * */
}
