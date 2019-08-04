package com.ly.iterator.page_iterator;

import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.iterator.page_iterator
 * @ClassName: AggregationIterator
 * @Author: lin
 * @Description: 反页迭代的接口
 * @Date: 2019/8/4 21:38
 * @Version: 1.0
 */
public interface AggregationIterator {
    /**
     * 是否存在下一个元素，无论是否够一页数据
     * @return 有数据就返回 true ，没有 false
     */
    public boolean hasNext();

    /**
     * 取出下面几个元素
     * @param num 取出数量
     * @return 取出的元素集合
     */
    public List next(int num);

    /**
     * 是否存在上一个元素，无论是否够一页
     * @return 有数据就返回 true ，没有 false
     */
    public boolean hasPrevious();

    /**
     * 取出上面几个元素
     * @param num 取出的元素个数
     * @return 取出的元素集合
     */
    public List previous(int num);

    /**
     * 指定取出页数的数据
     * @param pageNum 页数
     * @param pageShow 每页的数据数
     * @return 取出的数据集合
     */
    public List getPage(int pageNum,int pageShow);
}
