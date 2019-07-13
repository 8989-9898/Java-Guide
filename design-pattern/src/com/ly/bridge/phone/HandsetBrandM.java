package com.ly.bridge.phone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.phone
 * @ClassName: HandsetBrandM
 * @Author: lin
 * @Description: 具体的 M 品牌手机
 * @Version: 1.0
 */
public class HandsetBrandM extends HandsetBrand {
    /**
     * 具体的手机品牌 M 运行的方法
     */
    @Override
    public void run() {
        System.out.print("M 品牌");

        soft.Run();
    }
}
