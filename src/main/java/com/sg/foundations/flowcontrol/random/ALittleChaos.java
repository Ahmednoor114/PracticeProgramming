/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author 16127
 */
public class ALittleChaos {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random can make integers: " + random.nextInt());
        System.out.println("Or a double : " + random.nextDouble());
        System.out.println("Or even a boolean: " + random.nextBoolean());

        int num = random.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + " , " + num);

        System.out.println("Or just keep generating new values ");
        System.out.println("Here's a bunch of numbers from 0 - 100: " );
        
        System.out.print(random.nextInt(51) + ", ");
        System.out.print(random.nextInt(101) + ", ");
        System.out.print(random.nextInt(101) + ", ");
        System.out.print(random.nextInt(101) + ", ");
        System.out.print(random.nextInt(101) + ", ");
        System.out.print(random.nextInt(101) + ", ");
       
    }
    
}
