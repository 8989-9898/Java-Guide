package com.ly.state.vote;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: BlackVoteState
 * @Author: lin
 * @Description: 禁止登陆的状态类
 * @Date: 2019-08-08 16:43
 * @Version: 1.0
 */
public class BlackVoteWarnState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        // 计入黑名单，禁止登陆系统
        System.out.println ("禁止登录和使用系统 3 天。");
        if (manager.getMapVoteCount ().get (user)>=9) {
            manager.getMapState ().put (user,new BlackVoteState ());
        }
    }
}
