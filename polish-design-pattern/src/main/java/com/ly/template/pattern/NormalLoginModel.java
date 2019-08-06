package com.ly.template.pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.pattern
 * @ClassName: NormalLoginModel
 * @Author: lin
 * @Description: 封装进行登录控制需要的数据，在公共的数据的基础上添加具体模块需要的数据
 * @Date: 2019-08-06 17:05
 * @Version: 1.0
 */
public class NormalLoginModel extends LoginModel {

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 密码的验证问题，密码验证问题的答案
     */
    private String question,answer;
}
