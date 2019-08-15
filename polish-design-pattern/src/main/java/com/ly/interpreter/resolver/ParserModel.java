package com.ly.interpreter.resolver;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.resolver
 * @ClassName: ParserModel
 * @Author: lin
 * @Description: 用来封装每一个解析出来的元素对应的属性
 * @Date: 2019-08-15 14:14
 * @Version: 1.0
 */
public class ParserModel {

    /**
     * 是否是单个值，不是表示多个
     */
    private boolean singleValue;

    /**
     * 是否是属性，不是表示就是元素
     */
    private boolean propertyValue;

    /**
     * 是否是终止符
     */
    private boolean end;

    public ParserModel() {
    }

    public ParserModel(boolean singleValue, boolean propertyValue, boolean end) {
        this.singleValue = singleValue;
        this.propertyValue = propertyValue;
        this.end = end;
    }

    public boolean isSingleValue() {
        return singleValue;
    }

    public void setSingleValue(boolean singleValue) {
        this.singleValue = singleValue;
    }

    public boolean isPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(boolean propertyValue) {
        this.propertyValue = propertyValue;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
