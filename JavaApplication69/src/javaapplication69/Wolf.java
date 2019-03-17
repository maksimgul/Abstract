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
public class Wolf extends Wild {
    Wolf() {
        System.out.println("Constr Wolf 1");
    }

    Wolf(int now, int max) {
        super(now, max);
        System.out.println("Constr Wolf 2");
    }
}