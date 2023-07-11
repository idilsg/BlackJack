import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        //Asking players name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //High score list'te ismi kullanırsın.

        Player player = new Player();
        ArrayList<String> playersCards = player.getPlayersCards();
        Deal deal = new Deal();

        boolean continueLoop = true;

        //oyuncu kart çekiyor
        while (continueLoop) {
            //Asking player if they want to take more cards.
            System.out.println("Continue (1) \nStop (2)");
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    deal.playerTakesCard();
                    break;
                case 2:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Choose again: ");
            }
            System.out.print(playersCards); //test
            //21'i geçip geçmediğine bak
            //if (geçti) lose;
        }

        //oyuncu 21'i geçip kaybettiyse bu bölüme geçmene gerek yok
        //dağıtıcı 16'yı geçene kadar kart çeksin.
        //her kart çektiğinde 21'i geçip geçmediğini kontrol et. geçerse oyuncu kazanır.
    }
}
