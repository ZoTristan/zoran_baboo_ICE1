/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 *@author Zoran Baboo
 *STUDENT ID: 991567274 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner keysin = new Scanner(System.in);
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Card chosenCard = new Card();
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Choose the suit of your choice");
        chosenCard.setSuit(keysin.nextLine());
        System.out.println("Next, you will need to choose the value of your choice but remember, Jokers are not in the card deck");
        System.out.println("So it will only be from 1(Ace) to 13(King)");
        System.out.println("Choose your card value");
        chosenCard.setValue(keysin.nextInt());
        
        
        
       
        // and search magicHand here
//         boolean sameCard = false;
//         for(Card c : magicHand){
            
//            if(c.getSuit().equalsIgnoreCase(chosenCard.getSuit()) && c.getValue() == chosenCard.getValue()){
//                sameCard = true;
//                break;
//            }
               
//         }
        
//         if(sameCard==true){
//             System.out.println("Your card is amongst the magicHand");
            
//         }else if(sameCard==false){
//             System.out.println("Nope");
//         }
        
        
        //Then report the result here     
        
        
        //This is where the 'lucky card is'
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(1);
        
        boolean sameCard = false;
        for(Card c : magicHand){
            if (c.getSuit().equalsIgnoreCase(luckyCard.getSuit()) && c.getValue() == luckyCard.getValue()){
                sameCard = true;
                break;
            }
        }
        
        if(sameCard==true){
            System.out.println("The lucky card was there!");
        }else{
            System.out.println("Nope");
        }
        
    }
    
    
    
    
    
    
}
