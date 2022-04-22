/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author 16127
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Random random = new Random();
        int cleanYourRoom= random.nextInt(10);

        do {
            // code block to be execute
            System.out.println("Clean your room !! "+ cleanYourRoom + " %" );


           cleanYourRoom = cleanYourRoom + 10;
        }
        while (cleanYourRoom<=71);
        System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
    
}
