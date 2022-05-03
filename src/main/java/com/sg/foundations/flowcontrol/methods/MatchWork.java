/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author 16127
 */
public class MatchWork {
    public static void main(String[] args) {
        


        System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore("C","H"));
        System.out.println(" Half of 42 = " + halfOf(42));
        System.out.println(" (short) Pi = " + pi());
        System.out.println(" The first letter of the word Llama is: " + firstLetter("L"));
        System.out.println(" 1337 x 1337 = " + times1337(1337));
        
        calculateAbdi();
        System.out.println("Int a / b : " + calculateAbdi(42));
        System.out.println("Int a / b : " + calculateAbdi(21));
        calculateAbdi("Hi", " Hellow");

    }

    public static double pi(){
        return 3.14;
    }

    public static int times1337(int x){
        return x * 1337;
    }

    public static double halfOf(double y){
        return y / 2;
    }

    public static String firstLetter(String word){
        return word.substring(0, 1);
    }

    public static boolean comesBefore(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }
    
    public static void calculateAbdi(){
        System.out.println("Start calculation: ");
    }
    
    public static int calculateAbdi(int a){
        return a / 7;
    }
    
    public static void calculateAbdi(String a, String b){
        System.out.println("My favourite greetings are : " + a + " and "+ b);
    }
    
}
