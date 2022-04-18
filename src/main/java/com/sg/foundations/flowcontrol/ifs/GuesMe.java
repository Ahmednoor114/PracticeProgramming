/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class GuesMe {
    public static void main(String[] args) {
        int answer = 22;
        int guessNumber;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a number: ");
        guessNumber = scanner.nextInt();
        
        if(guessNumber == answer){
            System.out.println("Wow, nice guess! That was it! " + answer);
        }
        else if(guessNumber < answer){
            System.out.println("Ha, nice try - too low! I chose #."+ answer);
        }
        else {
            System.out.println("Too bad, way too high. I chose #. "+ answer);
        }
    }
    
}
