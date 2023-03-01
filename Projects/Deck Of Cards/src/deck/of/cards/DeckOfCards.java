/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deck.of.cards;

/**
 *
 * @author dylan
 */
public class DeckOfCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Initianlize Cards
        
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        
        // Shuffle Cards
        
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        
        // Display the first four cards
        
        for (int i = 0; i < deck.length; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ":" + rank + " of " + suit);
        }
    }
    
}
