package com.ly.bridge.message;


/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.bridge.message
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用桥接模式实现发送各种消息
 * @Date: 2019-08-16 15:11
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体的实现对象
        MessageImplementor impl = new MessageSMS ();
        // 创建一个普通消息对象
        AbstractMessage message = new CommonMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");
        // 创建一个加急消息对象
        message = new UrgencyMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");
        // 创建一个加急消息对象
        message = new SpecialUrgencyMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");

        // 使用手机发送
        impl=new MessageMobile ();
        message = new CommonMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");
        // 创建一个加急消息对象
        message = new UrgencyMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");
        // 创建一个加急消息对象
        message = new SpecialUrgencyMessage (impl);
        message.sendMessage ("如何理解设计模式","Flank");
    }

    /**
     * 桥接模式的优点：
     *      分离抽象和实现部分：桥接模式分离了抽象部分和实现部分，从而极大的提高了系统的灵活性。让抽象部分和实现部分独立起来，
     *      分别定义接口，这有助于系统进行分层，从而产生更好的结构化系统。对于系统的高层部分，自需要知道系统的抽象部分和实现
     *      部分的接口就可以了。
     *      更好的扩展性：由于桥接模式把抽象部分和实现部分分离开了，而且分别定义接口，这就使得抽象部分和实现部分可以分别独立
     *      的扩展，而不会相互影响。从而大大提高了系统的扩展性。
     *      可动态的切换实现：由与桥接模式把抽象部分和实现部分分离开了，所以在实现桥接的时候，就可以实现动态的选择和使用具体
     *      的实现，也就是说一个实现不再是固定的绑定在一个抽象接口上，可以实现运行期间动态的切换。
     *      可减少子类的数量：根据前面的讲述，针对有两个变化纬度的情况，如果采用继承的方式实现，大约需要两个纬度上的可变化数
     *      量的乘积个数。而采用桥接模式来实现，大约需要两个纬度上可变化数量的和个子类。可以明显的减少子类数量。
     *
     * 桥接模式的本质是：分离抽象和实现。
     *
     * */
}
