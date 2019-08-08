package com.ly.state.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: RepeatVoteState
 * @Author: lin
 * @Description: 重复投票的状态实现类
 * @Date: 2019-08-08 16:41
 * @Version: 1.0
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        System.out.println ("请不要重复投票");
    }
}
