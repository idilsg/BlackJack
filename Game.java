import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        //Asking players name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //High score list'te ismi kullanırsın.

        boolean nextGame = true;

        int coins = 100;
        int enteredCoin = 0;

        while(nextGame) {

            while (true) {
                System.out.println("How many coins do you want to enter the game with? ");
                System.out.println("Current Total: " + coins);
                try {
                    enteredCoin = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    String input = sc.next();
                    System.out.println("You must enter an integer. ");
                }
                System.out.println("Number of coins entered: " + enteredCoin);
            }

            Player player = new Player();
            Dealer dealer = new Dealer();
            Deal deal = new Deal(player, dealer);
            PointCalculator calculator = new PointCalculator();

            boolean continueLoop = true;
            boolean continueDealer = true;
            boolean continueGame = true;
            int win = 1; //win=1, lose=0, equal=2

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
                int check1 = sc.nextInt();
                switch (check1) {
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
                if (playersPoints > 21) {
                    System.out.println("Player's points: " + playersPoints);
                    System.out.println("You lose.");
                    continueLoop = false;
                    continueDealer = false;
                    continueGame = false;
                    win = 0;
                }
            }

            if (continueDealer) {
                int dealersPoints = calculator.pointsD(dealer.getDealersCards());
                calculator.pointsD(dealer.getDealersCards());
                System.out.println("Dealers cards: " + dealer.getDealersCards());
                System.out.println("Dealers points: " + dealersPoints + "\n");
            }

            while (continueDealer) {
                int dealersPoints = calculator.pointsD(dealer.getDealersCards());
                calculator.pointsD(dealer.getDealersCards());

                if (dealersPoints > 16 && dealersPoints < 22) {
                    break;
                } else if (dealersPoints < 17) {
                    deal.dealerTakesCard();
                } else {
                    System.out.println("Dealer lost, you win!");
                    continueGame = false;
                    continueDealer = false;
                }
                dealersPoints = calculator.pointsD(dealer.getDealersCards());
                calculator.pointsD(dealer.getDealersCards());
                System.out.println("Dealers cards: " + dealer.getDealersCards());
                System.out.println("Dealers points: " + dealersPoints + "\n");
            }

            if (continueGame) {
                int playersPoints = calculator.pointsP(player.getPlayersCards());
                calculator.pointsP(player.getPlayersCards());
                int dealersPoints = calculator.pointsD(dealer.getDealersCards());
                calculator.pointsD(dealer.getDealersCards());

                if (playersPoints > dealersPoints) {
                    System.out.println("Player wins!");
                    win = 1;
                } else if (dealersPoints > playersPoints) {
                    System.out.println("Dealer wins!");
                    win = 0;
                } else {
                    System.out.println("Equal!");
                    win = 2;
                }
            }

            if (win == 1) coins = coins + enteredCoin;
            if (win == 0) coins = coins - enteredCoin;

            System.out.println("Current total coins: " + coins);

            System.out.println("Do you want to continue the game? ");
            System.out.println("Yes (1) \nNo (2) ");
            int check2 = sc.nextInt();
            switch (check2) {
                case 1:
                    System.out.println("Next Game");
                    break;
                case 2:
                    nextGame = false;
                    break;
                default:
                    System.out.println("Invalid choice. Choose again: ");
            }
        }
    }
}
