/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundation.basics.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class AdderVersion2 {
    public static void main(String[] args) {
        //        int sum = 0;
//        int operand1 = 0;
//        int operand2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number to be added: ");
        int operand1 = scanner.nextInt();

        System.out.println("Please enter the second number to be added: ");
        int operand2 = scanner.nextInt();

        int sum = operand1 + operand2;

        System.out.println("Sum is: " + sum);
                
    }
    
}
