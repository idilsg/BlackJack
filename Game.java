import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        //Asking players name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //High score list'te ismi kullanırsın.

        Player player = new Player();
        Dealer dealer = new Dealer();
        Deal deal = new Deal(player, dealer);
        PointCalculator calculator = new PointCalculator();

        boolean continueLoop = true;
        boolean continueDealer = true;
        boolean continueGame = true;

        //ilk dağıtım
        deal.playerTakesCard();
        deal.playerTakesCard();
        System.out.println("Your cards: " + player.getPlayersCards());

        deal.dealerTakesCard();
        System.out.println("Dealers cards: " + dealer.getDealersCards() + " *");
        deal.dealerTakesCard();


        //oyuncu kart çekiyor
        while (continueLoop) {
            int playersPoints = calculator.pointsP(player.getPlayersCards());
            calculator.pointsP(player.getPlayersCards()); //puan toplama
            System.out.println("Player's points: " + playersPoints);
            //Asking player if they want to take more cards.
            System.out.println("\nContinue (1) \nStop (2)");
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    deal.playerTakesCard();
                    break;
                case 2:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("\nInvalid choice. Choose again: ");
            }
            System.out.println(player.getPlayersCards());
            playersPoints = calculator.pointsP(player.getPlayersCards());
            calculator.pointsP(player.getPlayersCards()); //puan toplama
            if(playersPoints > 21){
                System.out.println("Player's points: " + playersPoints);
                System.out.println("You lose.");
                continueLoop = false;
                continueDealer = false;
                continueGame = false;
            }
        }

        if (continueDealer) {
            int dealersPoints = calculator.pointsD(dealer.getDealersCards());
            calculator.pointsD(dealer.getDealersCards());
            System.out.println("Dealers cards: " + dealer.getDealersCards());
            System.out.println("Dealers points: " + dealersPoints);
        }

        while (continueDealer) {
            int dealersPoints = calculator.pointsD(dealer.getDealersCards());
            calculator.pointsD(dealer.getDealersCards());

            if(dealersPoints > 16 && dealersPoints < 22){
                break;
            }
            else if (dealersPoints < 17){
                deal.dealerTakesCard();
            }
            else {
                System.out.println("Dealer lost, you win!");
                continueGame = false;
                continueDealer = false;
            }
            dealersPoints = calculator.pointsD(dealer.getDealersCards());
            calculator.pointsD(dealer.getDealersCards());
            System.out.println("Dealers cards: " + dealer.getDealersCards());
            System.out.println("Dealers points: " + dealersPoints);
        }

        if (continueGame) {
            int playersPoints = calculator.pointsP(player.getPlayersCards());
            calculator.pointsP(player.getPlayersCards());
            int dealersPoints = calculator.pointsD(dealer.getDealersCards());
            calculator.pointsD(dealer.getDealersCards());

            if (playersPoints > dealersPoints){
                System.out.println("Player wins!");
            }
            else if (dealersPoints > playersPoints){
                System.out.println("Dealer wins!");
            }
            else{
                System.out.println("Equal!");
            }
        }
    }
}
