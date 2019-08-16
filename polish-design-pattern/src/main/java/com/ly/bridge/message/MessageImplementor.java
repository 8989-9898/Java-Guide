package com.ly.bridge.message;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: MessageImplementor
 * @Author: lin
 * @Description: 实现发送消息的统一接口
 * @Date: 2019-08-16 15:12
 * @Version: 1.0
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser 要发送消息给的人
     */
    void send(String message,String toUser);

}
