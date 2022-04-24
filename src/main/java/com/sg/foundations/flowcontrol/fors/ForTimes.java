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
public class ForTimes {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite ? ");
        int n = scanner.nextInt();
        
        
        for(int i = 1; i <= 15; i++){ 
//            System.out.printf("%d * %d = %d \n" , userInput, i , userInput * i);  
              System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
