package com.ly.state.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: VoteState
 * @Author: lin
 * @Description: 封装一个投票状态行为相关的接口
 * @Date: 2019-08-08 11:16
 * @Version: 1.0
 */
public interface VoteState {

    /**
     * 处理状态对应的行为
     * @param user 投票人
     * @param voteItem 投票选择
     * @param manager 投票上下文，用来在具体的状态处理的时候，回调上下文的数据
     */
    public void vote(String user,String voteItem,VoteManager manager);
}
