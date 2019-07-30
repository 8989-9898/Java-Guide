package com.ly.proxy.pattern;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.pattern
 * @ClassName: Proxy
 * @Author: lin
 * @Description: 添加代理对象，代理数据库的访问,使用与员工类一致的接口
 * @Date: 2019/7/30 21:56
 * @Version: 1.0
 */
public class Proxy implements UserModelApi {

    /**
     * 持有被代理的具体对象
     */
    private UserModel model;

    /**
     * 表示是否已经重新加载过数据了
     */
    private boolean loaded = false;

    public Proxy(UserModel model) {
        this.model = model;
    }


    @Override
    public String getUserId() {

        return model.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        model.setUserId(userId);
    }

    @Override
    public String getName() {
        return model.getName();
    }

    @Override
    public void setName(String name) {
        model.setName(name);
    }

    @Override
    public String getDeptId() {
        // 需要判断是否已经装载过了
        if (!this.loaded) {
            // 从数据库中重新装载
            reload();
            // 设置为重新装载的标准为 true
            this.loaded=true;
        }
        return model.getDeptId();
    }

    @Override
    public void setDeptId(String deptId) {
        model.setDeptId(deptId);
    }

    @Override
    public String getSex() {
        // 需要判断是否已经装载过了
        if (!this.loaded) {
            // 从数据库中重新装载
            reload();
            // 设置为重新装载的标准为 true
            this.loaded=true;
        }
        return model.getSex();
    }

    @Override
    public void setSex(String sex) {
        model.setSex(sex);
    }

    /**
     * 重新查询数据库以获取完整的信息
     */
    private void reload() {
        System.out.println("重新查询数据库获取完整的数据 userId："+model.getUserId());
        Connection conn=null;
        try {
            conn=getConnection();
            // 只需要用户编号和姓名
            String sql="select * from tbl_user where userid = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1,model.getUserId());
            ResultSet set = pre.executeQuery();
            while (set.next()) {
                // 字形加载 除了 userid和name 以外的数据
                model.setDeptId(set.getString("deptid"));
                model.setSex(set.getString("sex"));
            }
            set.close();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "model=" + model +
                ", loaded=" + loaded +
                '}';
    }
}
