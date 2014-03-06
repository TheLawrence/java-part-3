/**
 * This program takes user input and prints
 * the input in a different way
 */
package p4;

import java.util.Scanner;

/** 
 * @author Lawrence Sarmiento
 *  Student # A00780938
 *  Set 1A
 */
public class Strings 
{

    public static void main(String[] args) 
    {
        
        String phrase = new String("This is a String test.");
        
        int phraseLength;   //Number of characters in the phrase String
        int middleIndex;    //Index of the middle character in the String
        String firstHalf;   //First half of the phrase String
        String secondHalf;  //Second half of the phrase String
        String switchedPhrase;  //A new phrase with original halves switched
        String middle3;     //The middle 3 characters in the String
        String city;    //User input 
        String state;   //User input
        String citystate;   //New string to print
        
        //Compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        
        //Get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        //Middle 3 characters
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        
        //Concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ', '*');
        
        //Print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println("Middle 3 characters: " + middle3);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your city");
        city = scan.nextLine();
        System.out.println("Please enter your state");
        state = scan.nextLine();
        
        //Change city to all lower case and state to all upper case
        city = city.toLowerCase();
        state = state.toUpperCase();
        
        //Change string to appear UPPERlowerUPPER
        citystate = state.concat(city + state);
        
        //Print citystate
        System.out.println(citystate);
        
        scan.close();
    }

}
