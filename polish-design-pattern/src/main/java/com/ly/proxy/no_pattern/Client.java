package com.ly.proxy.no_pattern;

import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy
 * @ClassName: Client
 * @Author: lin
 * @Description: 不是用模式的事例
 * @Date: 2019/7/30 21:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserManager manager = new UserManager();
        List<UserModel> users = manager.getUserByDeptId("0101");
        users.forEach(System.out::println);
    }

    /* 存在问题，在实际开发中（员工信息肯有十几个属性）我们可能只需要显示用户名和部门时会获取到许多不需要的数据，而占用较多的内存空间
     * 如何解决这个问题
     * 使用代理模式的虚代理解决*/
}
