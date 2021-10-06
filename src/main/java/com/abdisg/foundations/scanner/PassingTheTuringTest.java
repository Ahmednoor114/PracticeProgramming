/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdisg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        
        String userName = sc.nextLine();
        System.out.println("User Name is: " + userName);
        
        
//        String myName = sc.nextLine();
        System.out.println("Hi, " + userName + "! I am Abdi ");
        
        System.out.println("What is your favourite color? "); // Ask user input
        String color = sc.nextLine(); //Read user input
        System.out.println("My favoured color is : " + color); // Output user input
        
        System.out.println("Huh, Blue? Mine's Electric Lime. ");
        
        System.out.println("I really like limes. They're my favorite fruit, too.\n" +
"What's YOUR favorite fruit, Zaphod?"); // Ask user input
        String fruit = sc.nextLine(); //Read user input
        System.out.println("My favoured fruit is : " + fruit); // Output user input
        
        System.out.println("Really? Pawpaws? That's wild!\n" +
"Speaking of favorites, what's your favorite number?"); // Ask user input
        int number = sc.nextInt(); //Read user input
        System.out.println("My favorite number is:" + number ); // Output user's input
        
        System.out.println("42 is a cool number. Mine's -7.\n" +
"Did you know 42 * -7 is -294? That's a cool number too!"); 
        
        System.out.println("Well, thanks for talking to me " + userName ); 
        
        
    }
    
}
