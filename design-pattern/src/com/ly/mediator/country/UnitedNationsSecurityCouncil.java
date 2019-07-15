package com.ly.mediator.country;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.mediator.country
 * @ClassName: UnitedNationsSecurityCouncil
 * @Author: lin
 * @Description: 联合国安理会
 * @Date: 2019-07-15 13:36
 * @Version: 1.0
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (this.usa==country) {
            iraq.show(message);
        }else if (this.iraq==country){
            usa.show(message);
        }
    }
}
