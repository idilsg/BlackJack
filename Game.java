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

            //21'i geçip geçmediğine bak
            //if (geçti) lose;
        }

        //dağıtıcı kart çekiyor
        /* if(oyun devam ediyorsa){
            while (16 yı geçene kadar){
                deal.dealerTakesCard();
            }
            System.out.println("Dealers cards: " + dealer.getDealersCards());
        } */

        //oyuncu 21'i geçip kaybettiyse bu bölüme geçmene gerek yok
        //dağıtıcı 16'yı geçene kadar kart çeksin.
        //her kart çektiğinde 21'i geçip geçmediğini kontrol et. geçerse oyuncu kazanır.
    }
}
