package com.ly.bridge.message;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: MessageSMS
 * @Author: lin
 * @Description: 以站内短信息的方式发送消息
 * @Date: 2019-08-16 15:17
 * @Version: 1.0
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println ("使用站内短信息的方式，发送消息："+message+" 给 "+toUser);
    }
}
