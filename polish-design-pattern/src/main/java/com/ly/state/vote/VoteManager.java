package com.ly.state.vote;

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
     * 用户状态对应的状态处理对象， key 为用户名， value 为用户当前的状态处理类对象
     */
    private Map<String, VoteState> mapState = new HashMap<> ();

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
        // 2、状态的转换，交由状态自己管理
        state = mapState.get (user);
        // 为空说明是第一次投票，进入正常投票
        if (state==null) {
            state=new NormalVoteState ();
        }
        state.vote (user, voteItem, this);

    }

    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    public Map<String, VoteState> getMapState() {
        return mapState;
    }
}
