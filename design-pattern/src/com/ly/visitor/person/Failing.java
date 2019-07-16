package com.ly.visitor.person;

import com.ly.facade.two.SubSystemFour;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Failing
 * @Author: lin
 * @Description: 失败状态
 * @Date: 2019-07-16 8:38
 * @Version: 1.0
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，眼泪汪汪，谁也劝不了");
    }
}
