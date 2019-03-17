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
public class Wild extends Animals {
    private int max_tired = 100;
    private int now_tired = 50;
    int hunting = 15;

    Wild() {
        System.out.println("Constr Wild 1");
    }

    Wild(int now, int max) {
        this.now_tired = now;
        this.max_tired = max;
        System.out.println("Constr Wild 2");
    }
    
    public int getMax_tired() {
        return max_tired;
    }

    public int getNow_tired() {
        return now_tired;
    }

    public void playing(int now_tired, int hours) {
        System.out.println("now = " + now_tired);
        while (now_tired > 0 && hours > 0) {
            now_tired -= hunting/2;
            hours--;
        }
        if (now_tired <= 0) {
            now_tired = 0;
        }
        this.now_tired = now_tired;
    }
    
    @Override
    public void eating(int hours) {
    while (now_tired < max_tired && hours > 0) {
            now_tired += getEat();
            hours--;
        }
        if (now_tired > max_tired) {
            now_tired = max_tired;
        }
        this.now_tired = now_tired;
        System.out.println("Wild Wolf");
    }

}