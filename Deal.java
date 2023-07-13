import java.util.ArrayList;

public class Deal {
    private Player player;
    private Dealer dealer;

    public Deal(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public void playerTakesCard(){

        Deck deck = new Deck();
        ArrayList<String> shuffledDeck = deck.deck();

        String firstElement = shuffledDeck.get(0);
        player.getPlayersCards().add(firstElement);
        shuffledDeck.remove(0);
    }

    public void dealerTakesCard(){
        Deck deck = new Deck();
        ArrayList<String> shuffledDeck = deck.deck();

        String firstElement = shuffledDeck.get(0);
        dealer.getDealersCards().add(firstElement);
        shuffledDeck.remove(0);
    }
}
