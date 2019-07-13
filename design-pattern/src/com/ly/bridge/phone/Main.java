package com.ly.bridge.phone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.phone
 * @ClassName: Main
 * @Author: lin
 * @Description: 桥接模式的优点在于，将抽象部分和他的具体实现部分分离，使得他们都可以独立的变化
 *               比如我们要添加一个软件 播放音乐 只需要添加一个播放音乐的类继承手机软件类即可（HandsetMP3）
 *               或者我们要添加一个新的手机品牌只需要添加一个新的手机品牌类继承手机类即可 （HandsetBrandS）
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        HandsetBrand brand=null;

        brand=new HandsetBrandN();
        brand.setHandsetSoft(new HandsetGame());
        brand.run();
        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();

        brand=new HandsetBrandM();
        brand.setHandsetSoft(new HandsetGame());
        brand.run();
        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();

        brand=new HandsetBrandS();
        brand.setHandsetSoft(new HandsetMP3());
        brand.run();
        brand.setHandsetSoft(new HandsetGame());
        brand.run();
        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();
    }
}
