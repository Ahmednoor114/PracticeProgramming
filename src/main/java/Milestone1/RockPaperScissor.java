/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milestone1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        //Created input and random classes.
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();

        //Created all variables.
        int rock = 0;
        int paper = 1;
        int scissor = 2;
        int roundNumForTheUser = 0;
        int winner = 0;
        int loser = 0;
        int tie = 0;
        boolean adjust = true;

        int playerChoice;
        int computerChoice;

        //Prompt the player to play.
        System.out.println("How many rouds do you wanna play? ");
        roundNumForTheUser = sc.nextInt();
        sc.nextLine();
        //Prompt the player to play in between these range.
        while (roundNumForTheUser < 1 || roundNumForTheUser > 10) {
            System.out.println("You can only choice in between 1 and 10.");
            roundNumForTheUser = sc.nextInt();
            sc.nextLine();
        }
        //Created Loop for whole the code.
        while (adjust == true) {
            for (int i = 0; i < roundNumForTheUser; i++) { // inner loop for counting and processing the rest of the work.
                System.out.println("Choose either: 0 Rock, 1 Paper, 2 Scissors: ");
                playerChoice = sc.nextInt();
                sc.nextLine();
                computerChoice = rGen.nextInt(2) + 1;

                System.out.println("Computer choice: " + computerChoice);
                if (playerChoice == computerChoice) {
                    System.out.println("The play is a tie. " + computerChoice);
                    tie++;
                } else if (playerChoice == 0 && computerChoice == 1) {
                    System.out.println("You lost.");
                    loser++;
                } else if (playerChoice == 0 && computerChoice == 2) {
                    System.out.println("You are the winner.");
                    winner++;
                } else if (playerChoice == 1 && computerChoice == 0) {
                    System.out.println("You are the winner.");
                    winner++;
                } else if (playerChoice == 1 && computerChoice == 2) {
                    System.out.println("You Lost.");
                    loser++;
                } else if (playerChoice == 2 && computerChoice == 1) {
                    System.out.println("You are the winner.");
                    winner++;
                } else if (playerChoice == 2 && computerChoice == 0) {
                    System.out.println("You Lost.");
                    loser++;
                }
                System.out.println("Tie: " + tie);
                System.out.println("Won: " + winner);
                System.out.println("lose: " + loser);
            }
            System.out.println("Do you wanna play again? (y/n) ");
            String gamePlayAgain = sc.nextLine();
            if (gamePlayAgain.equals("y")){
                System.out.println("How many rouds do you wanna play? ");
                roundNumForTheUser = sc.nextInt();
                sc.nextLine();
                while (roundNumForTheUser < 1 || roundNumForTheUser > 10) {
                    System.out.println("You can only choice in between 1 and 10.");
                    roundNumForTheUser = sc.nextInt();
                    sc.nextLine();
                }
            }else {
                adjust = false;
                System.out.println("See you next time");
            }
        }
    }
    
}
