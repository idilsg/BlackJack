// ♠ ♣ ♦ ♥

public class Deck {
    public void deck(){
        String[] suits = {"♠", "♣", "♦", "♥"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        int k = 0;

        for (int i=0; i<4; i++){
            for (int j=0; j<13; j++){
                deck[k] = suits[i] + ranks[j];
                k++;
            }
        }

        for(String s: deck){
            System.out.print(s + " ");
        }
    }
}
