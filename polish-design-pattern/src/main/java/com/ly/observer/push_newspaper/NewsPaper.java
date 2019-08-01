package com.ly.observer.push_newspaper;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.observer.newspaper
 * @ClassName: NewsPaper
 * @Author: lin
 * @Description: 具体的目标对象，某一类型的报纸
 * @Date: 2019-08-01 9:47
 * @Version: 1.0
 */
public class NewsPaper extends Subject {
    /**
     * 用来描述报纸内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 内容有更新了，说明出了新的报纸通知订阅者阅读新报纸
        this.notifyObservers(this.content);
    }
}
