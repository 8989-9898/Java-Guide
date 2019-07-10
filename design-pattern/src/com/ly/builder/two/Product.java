package com.ly.builder.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.builder.two
 * @ClassName: Product
 * @Author: lin
 * @Description: 定义具体的产品集合
 * @Date: 2019-07-10 14:11
 * @Version: 1.0
 */
public class Product {
    private List<String> parts=new ArrayList<>(16);

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        parts.stream().forEach(System.out::println);
    }

}
