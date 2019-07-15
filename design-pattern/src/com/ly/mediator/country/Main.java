package com.ly.mediator.country;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.country
 * @ClassName: Main
 * @Author: lin
 * @Description:
 * @Date: 2019-07-15 13:38
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil council = new UnitedNationsSecurityCouncil();
        USA usa = new USA(council);
        Iraq iraq = new Iraq(council);

        council.setIraq(iraq);
        council.setUsa(usa);

        usa.declare("不准研制核武器，否则发动战争");
        iraq.declare("我们没有研制核武器，也不怕侵略");
    }
}
