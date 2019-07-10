package com.ly.decorator.two;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.two
 * @ClassName: Decorate
 * @Author: lin
 * @Description: 开始装扮
 * @Date: 2019-07-08 9:35
 * @Version: 1.0
 */
public class Decorate {
    public static void main(String[] args) {
        Person frank = new Person("Frank");
        Sneakers sneakers = new Sneakers();
        Suit suit = new Suit();
        Tie tie = new Tie();
        sneakers.decorate(frank);
        suit.decorate(sneakers);
        tie.decorate(suit);
        tie.show();
    }
}
