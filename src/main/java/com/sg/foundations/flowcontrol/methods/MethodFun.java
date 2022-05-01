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
public class MethodFun {
    public static void main(String[] args) {
        //Inside the main method is where we call or recall as many times as we need after we created our method.
        //Here is where repetion happens.
        doIt();
        doIt();
        doIt();
    }
    //Our method has no return type and prameter.
    public static void doIt(){ 
        // we declared or created the method outside of the main method.
        // Our method doesn't have parameter list and return type now which are optional.
        System.out.println("Hello World"); 
    }
}
