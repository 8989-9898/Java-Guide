package com.ly.state.vote;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用状态模式实现投票系统（使用状态自己维护和管理状态）,可以方便的扩展如添加奖励积分，和投票超过 8 次但不满 10 次的给予警告
 *               只需要修改新添加的状态的上一级状态指向他即可
 * @Date: 2019-08-08 11:16
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager ();
        for (int i = 0; i < 10; i++) {
            manager.vote ("user","PHP 是世界上最好的语言");
        }
    }
}
