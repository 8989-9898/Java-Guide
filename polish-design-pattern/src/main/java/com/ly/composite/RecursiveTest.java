package com.ly.composite;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.composite
 * @ClassName: RecursiveTest
 * @Author: lin
 * @Description: 递归测试
 * @Date: 2019/8/5 21:37
 * @Version: 1.0
 */
public class RecursiveTest {

    public static void main(String[] args) {
        System.out.println("5 的乘积是："+recursive(5));
    }

    public static int recursive(int a){
        if (a==1) {
            return 1;
        }
        return a*recursive(a-1);
    }
}
