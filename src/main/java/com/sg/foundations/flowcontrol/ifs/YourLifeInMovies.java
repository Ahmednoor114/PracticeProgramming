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
public class YourLifeInMovies {
    public static void main(String[] args) {
        int yearBornBefore2005 = 2005;
        int yearBornBefore1995 = 1995;
        int yearBornBefore1985 = 1985;
        int yearBornBefore1975 = 1975;
        int yearBornBefore1965 = 1965;
        int yearBornBefore1980 = 1980;
        int dateOfBirth;
        String userName;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, Let's play a game! What is your name? ");
        userName = scanner.nextLine();

        System.out.println("Ok, " + userName + " when were you born? ");
        dateOfBirth = scanner.nextInt();
        System.out.println("Well " + userName + " ...");

        if (dateOfBirth == yearBornBefore2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }
        if (dateOfBirth == yearBornBefore1995) {
            System.out.println("the first Harry Potter came out over 15 years ago.");
        }
        if (dateOfBirth == yearBornBefore1985) {
            System.out.println(" Space Jam came out not last decade, but the one before THAT.");
        }
        if (dateOfBirth == yearBornBefore1975) {
            System.out.println(" the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (dateOfBirth == yearBornBefore1965) {
            System.out.println("MASH TV series has been around for almost half a century!");
        }
        if (dateOfBirth == yearBornBefore1980) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
    }
    
}
