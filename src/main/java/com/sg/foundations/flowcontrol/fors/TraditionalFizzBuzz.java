/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        int number = scanner.nextInt();
        
        for (int i = 0; i <= number; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
        }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Bizz");
            }
            else {
                System.out.println(i);
            }
            
        }
        System.out.println("TRADITION!!!!!");
    }
    
    
}
