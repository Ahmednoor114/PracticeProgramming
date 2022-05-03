/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author 16127
 */
public class MethodFunFour {
    public static void main(String[] args) {
        int operand1 = 3;
        int operand2 = 7;
        int sum = add(operand1,operand2);
        System.out.println(sum);
        
        sum = add(3,7);
        System.out.println(sum);
        
        
        System.out.println(add(3,7));
        
    }
    public static int add(int a, int b){
        return a + b;
    }
    
}
