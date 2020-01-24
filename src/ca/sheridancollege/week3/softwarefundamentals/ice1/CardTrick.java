/*
 * modifier -- Milankumar Pavasiya (991558924)
 * To change this template file, choose Tools | Templates
 
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        int value;
        String suit;
        Card[] magicHand = new Card[7];
        Card c = new Card();
        
        c.getValue();
        c.getSuit();
        
        //Random randNumber = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            value=(int)(Math.round(Math.random()*12);
           
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number of card between 1-13");
        value = input.nextInt();
        
        suit = input.nextInt();
        
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
