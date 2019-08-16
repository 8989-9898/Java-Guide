package com.ly.bridge.message;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: CommonMessage
 * @Author: lin
 * @Description: 加急信息
 * @Date: 2019-08-16 15:19
 * @Version: 1.0
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor implementor) {
        super (implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 发送加急信息
        message = "加急：" + message;
        super.sendMessage (message, toUser);
    }

    /**
     * 扩展自己的功能，监控某消息的处理过程
     *
     * @param messageId 被监控的消息编号
     * @return 返回监控数据
     */
    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
