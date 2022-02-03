/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Modified by Ram Gupta 991631201
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card tenClubs = new Card("Clbs", 10);
        System.out.println("Suit: " + tenClubs.getSuit() + "\n" 
                         + "Value: " + tenClubs.getValue() );
        Card fourClubs = new Card("Clbs", 4);
        
    }
}
