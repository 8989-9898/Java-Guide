package com.ly.bridge.phone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.phone
 * @ClassName: HandsetBrand
 * @Author: lin
 * @Description: 手机品牌抽象类
 * @Version: 1.0
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft){
        this.soft=soft;
    }

    /**
     * 具体的手机品牌的软件运行方法
     */
    public abstract void run();
}
