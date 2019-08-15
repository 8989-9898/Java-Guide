package com.ly.memento.memento;

import java.net.CacheRequest;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.memento.memento
 * @ClassName: Client
 * @Author: lin
 * @Description: 备忘录模式的简单事例
 * @Date: 2019-08-09 16:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        // 设置初始数据
        originator.setState("start");
        System.out.println("开始时数据：" + originator.getState());
        // 为数据创建备忘录，用于对当前数据的不同操作
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);
        // 修改数据
        originator.setState("change");
        System.out.println("修改后的数据：" + originator.getState());
        // 使用备忘录将数据还原，进行其它操作
        originator.setMemento(caretaker.retriveMemento());
        System.out.println("使用备忘录还原的数据：" + originator.getState());
    }

/**
 * 备忘录模式的优点：
 *      更好的封装性：备忘录模式通过使用备忘录对象，来封装原发器对象的内部状态，虽然这个对象式保存在原发器对象的
 *      外部的，但是有备忘录对象那个的窄接口不提供任何的方法。这样就有效的保证了原发器对象内部状态的封装，不把原
 *      发器对象的内部实现细节暴露给外部。
 *      简化了原发器：备忘录模式中，备忘录对象呗保存到原发器之外，让客户来管理他们请求的状态，从而让原发器的到简化。
 *      窄接口和宽接口：备忘录模式中，引入了窄接口和宽接口，使得不同的地方对备忘录对象的访问是不一样的。窄接口保证
 *      了只有原发器对象才可以访问备忘录对象的状态。
 *
 * 备忘录模式的缺点：
 *      可能会导致高开销：备忘录模式的基本功能，就是对备忘录对象的存储和恢复，它的基本实现方式就是缓存备忘录对象。
 *      这样一来，如果需要缓存的数据量很大，或者是特别频繁的创建备忘录对象，开销是很大的。
 *
 * 备忘录模式的本质：保存和恢复内部状态。
 *
 * */
}
