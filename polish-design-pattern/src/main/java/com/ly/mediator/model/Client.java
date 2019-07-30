package com.ly.mediator.model;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.model
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试广义中介者
 * @Date: 2019-07-30 15:04
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
        // 测试的部门
        Dept dept = new Dept();
        dept.setId("d1");
        Dept dept1 = new Dept();
        dept1.setId("d2");
        // 测试的员工
        User u1 = new User();
        u1.setId("u1");

        // 撤销部门前打印信息
        System.out.println("撤销部门前打印信息------------------------------");
        mediator.showUserDepts(u1);
        // 执行真正业务，撤销这个部门
        dept.deleteDept();
        System.out.println("撤销部门后打印信息------------------------------");
        mediator.showUserDepts(u1);

        System.out.println("-------------------------------------------------------------------");
        // 撤销部门前打印信息
        System.out.println("员工离职前打印信息------------------------------");
        mediator.showDeptUsers(dept1);
        // 执行真正业务，撤销这个部门
        u1.deleteUser();
        System.out.println("员工离职后打印信息------------------------------");
        mediator.showDeptUsers(dept1);
    }
}
