import java.util.ArrayList;

public class Deal {

    public void dealV{
        Deck deck = new Deck();
        ArrayList<String> shuffledDeck = deck.deck();
    }
    public void playerTakesCard(){

        Player player = new Player();
        ArrayList<String> playersCards = player.getPlayersCards();

        String firstElement = shuffledDeck.get(0);
        playersCards.add(firstElement);
        shuffledDeck.remove(0);
    }

    public void dealerTakesCard(){
        Deck deck = new Deck();
        ArrayList<String> shuffledDeck = deck.deck();

        Dealer dealer = new Dealer();
        ArrayList<String> dealersCards = dealer.getDealersCards();

        String firstElement = shuffledDeck.get(0);
        dealersCards.add(firstElement);
        shuffledDeck.remove(0);
    }
}
