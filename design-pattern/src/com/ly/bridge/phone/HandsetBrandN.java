package com.ly.bridge.phone;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.bridge.phone
 * @ClassName: HandsetBrandN
 * @Author: lin
 * @Description: 具体的手机，品牌是 N
 * @Version: 1.0
 */
public class HandsetBrandN extends HandsetBrand{

    /**
     * 具体的N品牌手机运行的方法
     */
    @Override
    public void run() {
        System.out.print("N 品牌");
        soft.Run();
    }
}
