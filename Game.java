import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        //Asking players name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //High score list'te ismi kullanırsın.

        //Asking player if they want to take more cards.
        System.out.println("Continue (1) \nStop (2)"); //while döngüsüne al
        int check = sc.nextInt();
        boolean continueLoop = true;

        while (continueLoop) {
            switch (check) {
                case 1:
                    //falan filan
                    break;
                case 2:
                    //falan filan
                    continueLoop = false;
                    break;
                default:
                    //tekrar sor
            }
        }
    }
}
