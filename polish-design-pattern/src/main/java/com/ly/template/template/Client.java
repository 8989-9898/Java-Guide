package com.ly.template.template;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.template
 * @ClassName: Client
 * @Author: lin
 * @Description: 模板方法的简单实例
 * @Date: 2019-08-06 16:29
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 在此处 new 的是哪个子类就使用哪个子类的具体的实现
        AbstractClass abstractClass=new ConcreateClass();
        abstractClass.templateMethod();
    }
}
