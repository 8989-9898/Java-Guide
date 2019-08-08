package com.ly.state.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: VoteManager
 * @Author: lin
 * @Description: 投票管理类，相当于上下文对象
 * @Date: 2019-08-08 11:18
 * @Version: 1.0
 */
public class VoteManager {

    /**
     * 持有相应的状态类
     */
    private VoteState state;

    /**
     * 记录用户投票的结果，key是用户名，value是投票的选项
     */
    private Map<String, String> mapVote = new HashMap<> ();

    /**
     * 记录用户投票的次数，key 是用户名，value 是投票次数
     */
    private Map<String, Integer> mapVoteCount = new HashMap<> ();

    /**
     * 获取用户投票结果的map
     *
     * @return
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user, String voteItem) {
        // 1、先为用户增加投票次数
        Integer integer = mapVoteCount.get (user);
        if (integer == null) {
            // 说明是第一次投票
            integer = 0;
        }
        integer += 1;
        mapVoteCount.put (user, integer);
        // 2、判断用户投票的类型，是正常，重复、恶意、还是黑名单，然后根据投票类型进行相应的处理
        if (integer == 1) {
            state = new NormalVoteState2 ();
        } else if (integer > 1 && integer < 5) {
            state = new RepeatVoteState ();
        } else if (integer >= 5 && integer < 8) {
            state = new SpiteVoteState ();
        } else if (integer >= 8 && integer < 10) {
            state = new BlackVoteWarnState ();
        } else if (integer >= 10) {
            state = new BlackVoteState ();
        }
        state.vote (user,voteItem,this);
    }
}
