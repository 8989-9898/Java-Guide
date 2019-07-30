package com.ly.proxy.no_pattern;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.no_pattern
 * @ClassName: UserManager
 * @Author: lin
 * @Description: 用户类的数据库访问类
 * @Date: 2019/7/30 21:20
 * @Version: 1.0
 */
public class UserManager {

    /**
     * 根据部门id获取部门下的所有人员信息
     * @param deptId
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public List<UserModel> getUserByDeptId(String deptId) throws SQLException, ClassNotFoundException {
        List<UserModel> list=new ArrayList<>();
        Connection conn=null;
        try {
            conn=getConnection();
            String sql="select * from tbl_user u,tbl_dept d where u.deptid=d.deptid and d.deptid like ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1,deptId+"%");
            ResultSet set = pre.executeQuery();
            while (set.next()) {
                UserModel model = new UserModel();
                model.setDeptId(set.getString("deptid"));
                model.setName(set.getString("name"));
                model.setSex(set.getString("sex"));
                model.setUserId("userid");
                list.add(model);
            }
            set.close();
            pre.close();
        }finally {
            conn.close();
        }
        return list;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
    }

}
