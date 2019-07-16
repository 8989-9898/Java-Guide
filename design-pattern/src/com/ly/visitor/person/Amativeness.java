package com.ly.visitor.person;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Amativeness
 * @Author: lin
 * @Description: 恋爱状态
 * @Date: 2019-07-16 8:41
 * @Version: 1.0
 */
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，凡事不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，遇事懂也装不懂");
    }
}
