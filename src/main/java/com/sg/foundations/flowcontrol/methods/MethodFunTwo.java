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
public class MethodFunTwo {
    public static void main(String[] args) {
        //we can call and used our method in 3 ways: Ignore it, put into varriable or pass into.
        get5(); // 2) Ignore it example doesnot do anything.
        
        int num = get5(); // 3)We declare variable and then intialize that variables what comes back from get5.
        System.out.println(num); // 4) Print out the value of num.
        
        System.out.println(get5()); // 5) In shortcut, we can escape step 3, and 4 and used pass into get5 in the printline statement.
        System.out.println(get5()); // 5) In shortcut, we can escape step 3, and 4 and used pass into get5 in the printline statement.
    }
    
    public static int get5(){
        // 1) Our method has return type but not parameter, and we decalare return type value.
        return 5; //
    }
}
