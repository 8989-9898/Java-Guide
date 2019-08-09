package com.ly.state.vote;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.state.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用状态模式实现投票系统（使用状态自己维护和管理状态）,可以方便的扩展如添加奖励积分，和投票超过 8 次但不满 10 次的给予警告
 *               只需要修改新添加的状态的上一级状态指向他即可
 *               可以使用数据库和文件的方式保存状态编码
 *               如数据库存储状态编码，在状态转换的时候将状态编码放入到数据库中，在使用时将状态编码获取到，根据状态编码创建指定的状态处理对象
 *               如想更加通用一点可以使用配置文件的方式，就是将状态编码放入到数据库中，在获取到状态编码后，使用状态编码在配置文件中找到相应的
 *               状态处理类，利用反射的方式创建对象。
 * @Date: 2019-08-08 11:16
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager ();
        for (int i = 0; i < 10; i++) {
            manager.vote ("user","PHP 是世界上最好的语言");
        }
    }
}
