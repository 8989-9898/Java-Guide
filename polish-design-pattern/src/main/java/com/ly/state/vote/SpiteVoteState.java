package com.ly.state.vote;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: SpiteVoteState
 * @Author: lin
 * @Description: 恶意投票的状态实现类
 * @Date: 2019-08-08 16:42
 * @Version: 1.0
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager manager) {
        String s = manager.getMapVote ().get (user);
        if (s != null) {
            manager.getMapVote ().remove (s);
        }
        System.out.println ("你也恶意投票行为，取消你的投票资格");
        // 恶意投票结束，进入下一状态
        if (manager.getMapVoteCount ().get (user) == 7) {
            manager.getMapState ().put (user, new BlackVoteWarnState ());
        }
    }
}
