/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author 16127
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = chooseRandomColor(); // call color method here
        String animal = chooseRandomAnimal(); // call animal method again here
        String colorAgain = chooseRandomColor(); // call color method again here
        int weight = chooseRandomInteger(200,5); // call number method,
        // with a range between 5 - 200
        int distance = chooseRandomInteger(20,10); // call number method,
        // with a range between 10 - 20
        int number = chooseRandomInteger(2000,1000); // call number method,
        // with a range between 10000 - 20000
        int time = chooseRandomInteger(6,2); // call number method,
        // with a range between 2 - 6


        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + " lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    // ??? Method 1 ???
    public static String chooseRandomColor(){
        Random random = new Random();
        int yourColor = random.nextInt(5);

        switch (yourColor){
            case 0:
                return ("Blue");
            case 1:
                return ("Black");
            case 2:
                return ("Brown");
            case 3:
                return ("Red");
            case 4:
                return ("White");
            default:
                return ("Grey");
        }
}
    // ??? Method 2 ???
    public static String chooseRandomAnimal(){
        Random random = new Random();
        int yourAnimal = random.nextInt(5);
        switch (yourAnimal){
            case 0:
                return ("Lion");
            case 1:
                return ("Tiger");
            case 2:
                return ("Hyena");
            case 3:
                return ("Wild Dog");
            case 4:
                return ("Cheetah");
            default:
                return ("Python");
        }
    }


    // ??? Method 3 ???

    public static int chooseRandomInteger(int maxNum, int minNum){
        Random randomNumber = new Random();
        return randomNumber.nextInt(maxNum-minNum) + minNum;

    }
    
}
