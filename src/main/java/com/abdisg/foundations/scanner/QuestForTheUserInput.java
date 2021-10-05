/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdisg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author ahmednoorabdi
 */
public class QuestForTheUserInput {
    public static void main(String[] args) {
        //Declare Scanner
        Scanner inputReader = new Scanner(System.in);
        //Declare Strings and Double.
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        //We can use the Scanner's readline to assign value to our strings
        //because its return type is string
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();
        
        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String
        
        System.out.println("What is the airspeed velocity of an uladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You did't even know if the swallow was African or European!");
        System.out.println("May skip answering things about birds and instead go " + yourQuest + ".");
        
    }
    
}
