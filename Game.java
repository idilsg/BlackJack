import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        //Asking players name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //High score list'te ismi kullanırsın.

        boolean continueLoop = true;

        while (continueLoop) {
            //Asking player if they want to take more cards.
            System.out.println("Continue (1) \nStop (2)");
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    Deal deal = new Deal();
                    deal.playerTakesCard();
                    //21'i geçip geçmediğine bak
                    break;
                case 2:
                    //21'i geçip geçmediğine bak
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Choose again: ");
            }
        }
    }
}
