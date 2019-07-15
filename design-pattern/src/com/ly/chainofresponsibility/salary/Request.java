package com.ly.chainofresponsibility.salary;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chainofresponsibility.salary
 * @ClassName: Request
 * @Author: lin
 * @Description: 请求参数类
 * @Date: 2019-07-15 11:05
 * @Version: 1.0
 */
public class Request {
    private String requestType;
    private String requestContent;
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
