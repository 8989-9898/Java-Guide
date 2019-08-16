package com.ly.chain.of.responsibility.fee2;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.fee2
 * @ClassName: RequestModel
 * @Author: lin
 * @Description: 通用的请求对象
 * @Date: 2019-08-16 13:34
 * @Version: 1.0
 */
public class RequestModel {

    /**
     * 请求的类型
     */
    private String type;

    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
