package com.ly.mediator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.model
 * @ClassName: DeptUserMediatorImpl
 * @Author: lin
 * @Description:
 * @Date: 2019-07-29 16:08
 * @Version: 1.0
 */
public class DeptUserMediatorImpl {

    /**
     * 将中介者实现成单例模式（饿汉式）
     */
    private static DeptUserMediatorImpl mediator = new DeptUserMediatorImpl();

    private DeptUserMediatorImpl() {initData(); }

    public static DeptUserMediatorImpl getInstance() {
        return mediator;
    }

    /**
     * 表示数据库，记录的关系数据
     */
    private List<DeptUserModel> cache = new ArrayList<>();

    /**
     * 初始化测试数据
     */
    private void initData(){
        cache.add(new DeptUserModel("du1","d1","u1"));
        cache.add(new DeptUserModel("du2","d1","u2"));
        cache.add(new DeptUserModel("du3","d2","u3"));
        cache.add(new DeptUserModel("du4","d2","u4"));
        cache.add(new DeptUserModel("du5","d2","u1"));
    }

    /**
     * 因部门撤销引起的人员的交互，需要出去相应的关系
     * @param id 部门编号
     */
    public boolean deleteDept(String id) {
        // 用于记录该部门需要清除的关系对象
        ArrayList<DeptUserModel> list = new ArrayList<>();
        for (DeptUserModel model : cache) {
            if (model.getDeptId().equals(id)) {
                // 记录需要清除的关系
                list.add(model);
            }
        }
        // 清除所有关系
        cache.removeAll(list);
        return true;
    }

    /**
     * 完成因人员离职引起的部门交互
     * @param id 员工编号
     * @return
     */
    public boolean deleteUser(String id) {
        // 用于记录该员工需要清除的关系对象
        ArrayList<DeptUserModel> list = new ArrayList<>();
        for (DeptUserModel model : cache) {
            if (model.getUserId().equals(id)) {
                // 记录需要清除的关系
                list.add(model);
            }
        }
        // 清除所有关系
        cache.removeAll(list);
        return true;
    }


    /**
     * 打印该部门下的所有员工 编号
     * @param dept
     */
    public void showDeptUsers(Dept dept){
        for (DeptUserModel model : cache) {
            if (model.getDeptId().equals(dept.getId())) {
                System.out.println("部门编号："+dept.getId()+"下面拥有的员工编号："+model.getUserId());
            }
        }
    }

    /**
     * 打印该所有员工的所属部门 编号
     * @param user
     */
    public void showUserDepts(User user){
        for (DeptUserModel model : cache) {
            if (model.getUserId().equals(user.getId())) {
                System.out.println("员工编号："+user.getId()+"所属的部门编号："+model.getDeptId());
            }
        }
    }

}
