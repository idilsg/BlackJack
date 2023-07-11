import java.util.ArrayList;

public class Dealer {
    private ArrayList<String> dealersCards;

    public Dealer() {
        dealersCards = new ArrayList<>();
    }

    public ArrayList<String> getDealersCards() {
        return dealersCards;
    }

    public void setDealersCards(ArrayList<String> dealersCards) {
        this.dealersCards = dealersCards;
    }
}
