package com.ly.state.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: NormalVoteState
 * @Author: lin
 * @Description: 普通状态的实现类
 * @Date: 2019-08-08 16:37
 * @Version: 1.0
 */
public class NormalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        manager.getMapVote ().put (user, voteItem);
        System.out.println ("正常投票，恭喜你投票成功");
    }
}
