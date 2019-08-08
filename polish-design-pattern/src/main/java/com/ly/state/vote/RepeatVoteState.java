package com.ly.state.vote;

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
        // 重复投票，进入下一状态
        if (manager.getMapVoteCount ().get (user) == 4) {
            manager.getMapState ().put (user, new SpiteVoteState ());
        }
    }
}
