package com.ly.state.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.no_pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用状态模式的实例
 *              这样只的投票系统不容易扩展和修改，会导致 VoteManager 类过于庞大，如需要添加投票次数不足 10 次超过8次就给个机会只是禁止登录几天
 *              就需要修改 VoteManager类如果将来的要求越多，就会导致该类越来越庞大，不易于维护。
 *              使用状态模式改善该种方式
 * @Date: 2019-08-08 10:01
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
