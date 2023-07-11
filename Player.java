import java.util.ArrayList;

public class Player {
    private ArrayList<String> playersCards;

    public Player() {
        playersCards = new ArrayList<>();
    }

    public ArrayList<String> getPlayersCards() {
        return playersCards;
    }

    public void setPlayersCards(ArrayList<String> playersCards) {
        this.playersCards = playersCards;
    }
}
