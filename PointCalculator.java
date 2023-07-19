import java.util.ArrayList;

public class PointCalculator {

    public int pointsP(ArrayList<String> playerCards){
        int playersPoints = 0;

        for (String card : playerCards) {
            char rank = card.charAt(1);
            switch (rank) {
                case 'A':
                    playersPoints += 1;
                    break;
                case '2':
                    playersPoints += 2;
                    break;
                case '3':
                    playersPoints += 3;
                    break;
                case '4':
                    playersPoints += 4;
                    break;
                case '5':
                    playersPoints += 5;
                    break;
                case '6':
                    playersPoints += 6;
                    break;
                case '7':
                    playersPoints += 7;
                    break;
                case '8':
                    playersPoints += 8;
                    break;
                case '9':
                    playersPoints += 9;
                    break;
                case '1':
                case 'J':
                case 'Q':
                case 'K':
                    playersPoints += 10;
                    break;
            }
        }
        return playersPoints;
    }

    public int pointsD(ArrayList<String> dealerCards){
        int dealersPoints = 0;

        for (String card : dealerCards) {
            char rank = card.charAt(1);
            switch (rank) {
                case 'A':
                    dealersPoints += 1;
                    break;
                case '2':
                    dealersPoints += 2;
                    break;
                case '3':
                    dealersPoints += 3;
                    break;
                case '4':
                    dealersPoints += 4;
                    break;
                case '5':
                    dealersPoints += 5;
                    break;
                case '6':
                    dealersPoints += 6;
                    break;
                case '7':
                    dealersPoints += 7;
                    break;
                case '8':
                    dealersPoints += 8;
                    break;
                case '9':
                    dealersPoints += 9;
                    break;
                case '1':
                case 'J':
                case 'Q':
                case 'K':
                    dealersPoints += 10;
                    break;
            }
        }
        return dealersPoints;
    }
}
