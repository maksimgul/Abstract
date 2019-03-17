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
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Cat my_cat = new Cat();
//        System.out.println(" ");
//        Cat my_cat2 = new Cat(60,100);
//        System.out.println(" ");
//        Cat my_cat3 = new Cat(60,100,"Fill");
//        System.out.println(my_cat3.getName());
//
//        System.out.println(" ");
//        my_cat.playing(4);
//        System.out.println(" ");
//        my_cat2.playing(5);
//        my_cat2.eating(2);
//        my_cat2.eating(1,5); //методом меняем параметр еды с 7 единиц на 5

    Animals kitty = new Cat(30,100);
    Animals woofy = new Wolf(70,100);
    Cat kitty2 = new Cat (35,100,"John");
    kitty.eating(2);
    kitty2.eating(5,10);
    }
    
}
