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
public class MethodFunThree {
    public static void main(String[] args) {
        //we can call and used our method in 3 different ways: Ignore it or put in literal value, put into varriable or pass into.
       silly(42); // 2)Pass in literal value.
       
       
       int num = 42; // 3) Put into varriable and then pass into Method silly.
       silly(num);
       
       silly(21+21); // 4) What I put into parameter is gone eveluate as an expression.
    }
    public static void silly(int i){
        // 1) Our method has parameter but not return type, and we don't decalare return type value because we used void.
        System.out.println("My parameter is: " + i);
    }
}
