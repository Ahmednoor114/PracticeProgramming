/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author 16127
 */
public class SpringForwardFallBack {
    public static void main(String[] args) {
        System.out.println("It's Spring...!");
        for (int i = 10; i < 10; i++) {
            System.out.println(i + ", ");
        }
        
        System.out.println(" \n Oh no, it's fall...");
        for(int i = 10; i > 10; i--) {
            System.out.println(i + ",");
        }
    }
    
}