package com.ly.mediator.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 使用中介者模式来，完成电脑看电影的过程
 * @Date: 2019-07-29 15:08
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 声明主板对象
        MotherBoard board = new MotherBoard();
        // 声明同时对象，同时设置统一的中介者
        CDDriver cdDriver = new CDDriver(board);
        CPU cpu = new CPU(board);
        VideoCard videoCard = new VideoCard(board);
        SoundCard soundCard = new SoundCard(board);
        // 中介者获取所有同事的对象，用于交互
        board.setCdDriver(cdDriver);
        board.setCpu(cpu);
        board.setVideoCard(videoCard);
        board.setSoundCard(soundCard);

        // 开始看电影，将光盘放入光驱中，光驱开始读取数据
        cdDriver.readCD();

    }

    /**
     * 中介者模式的优点：
     *      松散耦合：中介者模式通过将多个同事对象之间的交互封装到中介者对象里面，从而使得同事对象之间松散耦合，基本上可以做到互不依赖。
     *      这样一来，同事对象就可以独立的变化和复用，而不再像以前那样“牵一发而动全身”。
     *      集中控制交互：多个同时对象的交互，被封装到中介者对象里面集中管理，使得这些行为发生变化时，只需要修改中介者就可以了。如果是
     *      已经做好的系统就扩展中介者对象，而各个同事对象不需要修改。
     *      多对多变成一对多：没有使用中介者前，同事对象之间是多对多的关系，引入中介者对象以后。中介者对象和同事对象的关系通常就变为了
     *      一对多的关系，这会让对象的关系更加的简洁明了
     * 中介者模式的缺点：
     *      中介者模式的一个潜在的缺点，过度的集中化。如果同事对象的交互非常多，而且复杂，当这些复杂性全部集中到中介者的时候，会导致中
     *      介者对象变得非常的复杂，而且难于管理和维护。
     *
     * 中介者模式的本质是：封装交互。
     * */
}
