package com.ly.state.no_pattern;

import com.ly.facade.no_pattern.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.no_pattern
 * @ClassName: VoteManager
 * @Author: lin
 * @Description: 投票管理
 * @Date: 2019-08-08 10:30
 * @Version: 1.0
 */
public class VoteManager {
    /**
     * 记录用户投票的结果，key是用户名，value是投票的选项
     */
    private Map<String, String> mapVote = new HashMap<> ();

    /**
     * 记录用户投票的次数，key 是用户名，value 是投票次数
     */
    private Map<String, Integer> mapVoteCount = new HashMap<> ();


    /**
     * 投票
     *
     * @param user     投票人
     * @param voteItem 投票的选项
     */
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
            mapVote.put (user, voteItem);
            System.out.println ("正常投票，恭喜你投票成功");
        } else if (integer > 1 && integer < 5) {
            System.out.println ("请不要重复投票");
        } else if (integer >= 5 && integer < 8) {
            String s = mapVote.get (user);
            if (s != null) {
                mapVote.remove (s);
            }
            System.out.println ("你也恶意投票行为，取消你的投票资格");
        } else if (integer >= 8) {
            // 计入黑名单，禁止登陆系统
            System.out.println ("进入黑名单，禁止登录和使用该系统。");
        }
    }
}
