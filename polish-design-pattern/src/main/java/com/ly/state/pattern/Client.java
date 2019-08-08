package com.ly.state.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用状态模式实现投票系统,可以方便的扩展如添加奖励积分，和投票超过 8 次但不满 10 次的给予警告
 *               但是这样的扩展还是需要修改 VoteManager 类的，没有完全遵守 OCP 原则（开闭原则）
 *               该实例的状态维护和转换是在 上下文对象中控制的，也就是 VoteManager 内
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
