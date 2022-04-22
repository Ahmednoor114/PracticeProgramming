/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class GuessMeMore {
    public static void main(String[] args) {
        int answer;
        int guessNumber;
        
        int highestNum = 100;
        int lowestNum = -100;
                
        //final int MAX = 11;


        Scanner scanner = new Scanner(System.in);
        Random rGen = new Random();

        answer = rGen.nextInt(highestNum - lowestNum) + lowestNum;

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        guessNumber = scanner.nextInt();
        System.out.println("Your guess: " + guessNumber);

        System.out.println("Try one more time!");
        guessNumber = scanner.nextInt();
        System.out.println("Your guess: " + guessNumber);

        if(guessNumber == answer) {
            System.out.println("Wow, nice guess! That was it! " );
        }
        else if (guessNumber < answer) {
            System.out.println("Ha, nice try - too low! I chose #. ");
        }
        else {
            System.out.println("Too bad, way too high. I chose #. " );
        }
    }
    
}
