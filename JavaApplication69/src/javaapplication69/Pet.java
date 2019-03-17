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
public class Pet extends Animals {
    private int max_fullness = 100;
    private int now_fullness = 50;
    int play = 10;

    Pet() {
        System.out.println("Constr Pet 1");
    }

    Pet(int now, int max) {
        this.now_fullness = now;
        this.max_fullness = max;
        System.out.println("Constr Pet 2");
    }

    public int getMax_fullness() {
        return max_fullness;
    }

    public int getNow_fullness() {
        return now_fullness;
    }

    public void playing(int now_fullness, int hours) {
        System.out.println("now = " + now_fullness);
        while (now_fullness > 0 && hours > 0) {
            now_fullness -= play;
            hours--;
        }
        if (now_fullness <= 0) {
            now_fullness = 0;
        }
        this.now_fullness = now_fullness;
    }

    @Override
    public void eating(int hours) {
        while (getNow_fullness() < getMax_fullness() && hours > 0) {
            now_fullness += getEat();
            hours--;
        }
        if (now_fullness > max_fullness) {
            now_fullness = max_fullness;
        }
    }
    public void eating(int now_fullness, int hours, int n) {
        setEat(n);
        while (now_fullness < max_fullness && hours > 0) {
            now_fullness += getEat();
            hours--;
        }
        if (now_fullness > max_fullness) {
            now_fullness = max_fullness;
        }
        this.now_fullness = now_fullness;
    }
}