package com.ly.memento.memento;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.memento
 * @ClassName: RoleMemento
 * @Author: lin
 * @Description: 游戏进度保存箱
 * @Version: 1.0
 */
public class RoleMemento {
    private Integer vitality;
    private Integer attack;
    private Integer defence;
    public RoleMemento(Integer vitality, Integer attack, Integer defence) {
        this.vitality=vitality;
        this.attack=attack;
        this.defence=defence;
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }
}
