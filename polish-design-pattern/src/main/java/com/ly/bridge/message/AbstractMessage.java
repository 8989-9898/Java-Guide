package com.ly.bridge.message;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: AbstractMessage
 * @Author: lin
 * @Description: 抽象的消息对象
 * @Date: 2019-08-16 15:14
 * @Version: 1.0
 */
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor implementor;


    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 发送消息，转调实现部分的方法
     * @param message 消息
     * @param toUser 消息接受人
     */
    public void sendMessage(String message,String toUser){
        this.implementor.send (message,toUser);
    }
}
