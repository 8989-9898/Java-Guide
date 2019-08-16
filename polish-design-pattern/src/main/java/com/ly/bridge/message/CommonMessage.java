package com.ly.bridge.message;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: CommonMessage
 * @Author: lin
 * @Description: 普通信息
 * @Date: 2019-08-16 15:19
 * @Version: 1.0
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor implementor) {
        super (implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 发送普通信息，什么都不干，直接发送
        super.sendMessage (message, toUser);
    }
}
