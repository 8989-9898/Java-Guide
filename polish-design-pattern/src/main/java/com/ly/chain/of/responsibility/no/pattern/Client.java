package com.ly.chain.of.responsibility.no.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.chain.of.responsibility.no.pattern
 * @ClassName: Client
 * @Author: lin
 * @Description: 不使用责任链模式的聚餐费用申请
 * 处理流程不能灵活的改变，不能灵活的添加新的处理流程，业务的处理流程都集中一个类里，不适合扩展
 * @Date: 2019-08-16 10:28
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        FeeRequest request = new FeeRequest ();

        String mi = request.requestToProjectManager ("小米", 300);
        System.out.println (mi);
        String hong = request.requestToProjectManager ("小红", 300);
        System.out.println (hong);

        mi = request.requestToProjectManager ("小米", 900);
        System.out.println (mi);
        hong = request.requestToProjectManager ("小红", 900);
        System.out.println (hong);

        mi = request.requestToProjectManager ("小米", 3000);
        System.out.println (mi);
        hong = request.requestToProjectManager ("小红", 3000);
        System.out.println (hong);
    }
}
