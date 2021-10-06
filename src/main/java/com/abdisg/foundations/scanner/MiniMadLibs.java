/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdisg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author 16127
 */
public class MiniMadLibs {
    public static void main(String[] args) {
       float number;
       String noun, adjective, anotherNoun, anotherAdjective, pluralNoun, anotherPluralNoun, oneMorePluralNoun, verbPresentTense, sameVerbButPastTense;
      
       Scanner sc = new Scanner(System.in);
       
       noun =  "Chocolate";
       adjective = "spooky";
       anotherNoun = "Dodo";
       number =  10101;
       anotherAdjective = "red";
       pluralNoun =  "Kittens";
       anotherPluralNoun =  "balls";
       oneMorePluralNoun =  "Lettuce";
       verbPresentTense = "sneeze";
       sameVerbButPastTense = "sneezed";
     
       
       
       System.out.println("I need a noun: " + noun);
       System.out.println("Now an Adjective: " + adjective);
       System.out.println("Another noun: " + anotherNoun);
       System.out.println("Another number: " + number);
       System.out.println("Another adjective: " + anotherAdjective);
       System.out.println("A plural noun: " + pluralNoun);
       System.out.println("Another one: " + anotherPluralNoun);
       System.out.println("One more: " + oneMorePluralNoun);
       System.out.println("A verb (infinitive form): " + verbPresentTense);
       System.out.println("Same verb (past participle): " + sameVerbButPastTense);
       
       System.out.println("*** NOW LETS GET MAD (libs) ***");
       
       System.out.print(noun + ": the " + adjective + "frontier.These are the voyages of the startship " + anotherNoun + ". Its " + number + "- year mission: to explore strange " + anotherAdjective + "  " + pluralNoun + ", to seek out " + anotherAdjective + "  " + anotherPluralNoun + " and " + anotherAdjective + "  " + oneMorePluralNoun + ", to boldly " + verbPresentTense + " where no one has " + sameVerbButPastTense + " before.");
       
       
       // Using the + with strings doesn't add -- it concatenates! (sticks them together)
       
       
//        System.out.println(number + "  " + opinion + "  " + size + "  " + age + "  " + shape + "  " + color + "  " + origin + "  " + material + "  " + purpose + "  " + noun);
    }
    
}
