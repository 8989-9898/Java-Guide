package com.ly.visitor.person;

import com.ly.facade.two.SubSystemFour;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.visitor.person
 * @ClassName: Success
 * @Author: lin
 * @Description: 成功状态
 * @Date: 2019-07-16 8:35
 * @Version: 1.0
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+" 时，背后大多有一个不成功的男人");
    }
}
