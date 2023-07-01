// ♠ ♣ ♦ ♥

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
    public void deck(){
        String[] suits = {"♠", "♣", "♦", "♥"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] predeck = new String[52];
        int k = 0;

        for (int i=0; i<4; i++){
            for (int j=0; j<13; j++){
                predeck[k] = suits[i] + ranks[j];
                k++;
            }
        }

        /* for(String s: predeck){
            System.out.print(s + " ");
        } */

        ArrayList<String> deck = new ArrayList<>(Arrays.asList(predeck));
        Collections.shuffle(deck);
        System.out.print(deck); //test
    }
}
