package com.ly.decorator.no.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.no.pattern
 * @ClassName: DBCache
 * @Author: lin
 * @Description: 模拟数据库数据
 * @Date: 2019-08-15 16:16
 * @Version: 1.0
 */
public class DBCache {

    /**
     * 每个人的月度销售额
     */
    public static Map<String,Double> menoy=new HashMap<> ();

    static {
        menoy.put ("张三",10000.0);
        menoy.put ("赵六",20000.0);
        menoy.put ("李四",30000.0);
        menoy.put ("王五",40000.0);
    }
}
