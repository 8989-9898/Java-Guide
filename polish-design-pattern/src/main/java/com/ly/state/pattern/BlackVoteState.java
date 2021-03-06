package com.ly.state.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: BlackVoteState
 * @Author: lin
 * @Description: 黑名单的状态类
 * @Date: 2019-08-08 16:43
 * @Version: 1.0
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        // 计入黑名单，禁止登陆系统
        System.out.println ("进入黑名单，禁止登录和使用该系统。");
    }
}
