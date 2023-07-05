import java.util.ArrayList;

public class Deal {
    public void playerTakesCard(){
        Deck deck = new Deck();
        ArrayList<String> shuffledDeck = deck.deck();

        Player player = new Player();
        ArrayList<String> playersCards = player.getPlayersCards();

        String firstElement = shuffledDeck.get(0);
        shuffledDeck.remove(0);
        playersCards.add(firstElement);
    }
}
