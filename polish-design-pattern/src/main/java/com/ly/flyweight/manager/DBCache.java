package com.ly.flyweight.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.flyweight.no.pattern
 * @ClassName: DBCache
 * @Author: lin
 * @Description: 模拟数据库数据
 * @Date: 2019/8/10 19:20
 * @Version: 1.0
 */
public class DBCache {

    /**
     * 用来存放授权数据的值，是有个字符串格式
     */
    public static List<String> DB=new ArrayList<>();

    /**
     * 存放组合授权的数据
     */
    public static Map<String,String[]> mapDB=new HashMap<>();

    static {
        // 增加一个表示用来表示是否是组合授权对象
        DB.add("张三,人员列表,查看,1");
        DB.add("李四,人员列表,查看,1");
        DB.add("李四,操作薪资数据,,2");

        mapDB.put("操作薪资数据",new String[]{"薪资数据,查看","薪资数据,修改"});

        for (int i = 0; i < 3; i++) {
            DB.add("张三"+i+",人员列表,查看,1");
        }
    }

}
