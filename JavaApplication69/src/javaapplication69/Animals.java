/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

/**
 *
 * @author PC
 */
public abstract class Animals {
    int legs = 4;
    int tail = 1;
    private int eat = 7;

    Animals() {
        System.out.println("Constr Animals 1");
    }

    public int setEat(int eat) {
        this.eat = eat;
        return eat;
     }

    public int getEat() {
        return eat;
    }

    abstract public void eating(int hours);
}
