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
        // 用于记录该部门的
        ArrayList<DeptUserModel> list = new ArrayList<>();

        return true;
    }

    public boolean deleteUser(String id) {

        return true;
    }
}
