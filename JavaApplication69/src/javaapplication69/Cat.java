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
public class Cat extends Pet {
    private String name = "Murzik";

    Cat() {
        System.out.println("Constr Cat 1");
    }

    Cat(int now, int max) {
        super(now, max);
        System.out.println("Constr Cat 2");
    }
    Cat(int now, int max, String name) {
        super(now, max);
        this.name = name;
        System.out.println("Constr Cat 3");
    }

    public String getName() {
        return name;
    }

    public void playing(int hours) {
        playing(getNow_fullness(), hours);
        if (getNow_fullness() == 0) {
            System.out.println("Your " + name + " too tired. He must eat some food.");
        } else {
            System.out.println("After play " + name + " fullness = " + getNow_fullness());
        }
    }

    public void eating(int hours) {
        super.eating(hours);
        if (getNow_fullness() == getMax_fullness()){
        System.out.println("Your " + name + " eat a lot.");
    }
        System.out.println("After eating " + name + " fullness = " + getNow_fullness());
    }

    public void eating(int hours, int eat) {
        super.eating(getNow_fullness(), hours, eat);
        if (getNow_fullness() == getMax_fullness()){
            System.out.println("Your " + name + " eat a lot.");
        }
        System.out.println("After eating " + name + " fullness = " + getNow_fullness());
    }
}
