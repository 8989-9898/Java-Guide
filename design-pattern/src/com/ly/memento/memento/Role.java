package com.ly.memento.memento;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.memento.memento
 * @ClassName: Role
 * @Author: lin
 * @Description: 游戏角色
 * @Version: 1.0
 */
public class Role {

    private Integer vitality;
    private Integer attack;
    private Integer defence;

    public RoleMemento saveRole() {
        return new RoleMemento(vitality, attack, defence);
    }

    public void recoveryState(RoleMemento to) {
        this.defence = to.getDefence();
        this.vitality = to.getVitality();
        this.attack = to.getAttack();
    }

    public void show() {
        System.out.println("角色状态");
        System.out.println("攻击力：" + this.attack);
        System.out.println("生命力：" + this.vitality);
        System.out.println("防御力：" + this.defence);
    }

    public Role() {
        this.vitality = 100;
        this.attack = 100;
        this.defence = 100;
    }

    public void Fight() {
        this.defence = 0;
        this.vitality = 0;
        this.attack = 0;
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
