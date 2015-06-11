
/**
 *
 * @author Cvety
 */

public class Play {

    //za zapisvane na pechelivshite karti
    Card receiveCards1[] = new Card[52];
    int countPlayer1 = 0;
    Card receiveCards2[] = new Card[52];
    int countPlayer2 = 0;
    Deck deck = new Deck();
    Player[] players = new Player[2];
    int numOfRecursion = 0; // kolko poredni pyti ima voina
    int numOfCardsInWar = 3; // s kolko karti igraem voina
    int numOfIteration = 0; // broi iteraciite za dobavqne na karti

    Play(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
    }

    public void game() {


        //razkomentirai za proverka na posledovatelni voini !
//        deck.deck[0].strength = " ace ";
//        deck.deck[3].strength = " two ";
//        deck.deck[29].strength = " two ";
//        deck.deck[26].strength = " ace ";
//        deck.deck[6].strength = " two ";
//        deck.deck[33].strength = " two ";
//        deck.deck[5].strength = " two ";
//        deck.deck[34].strength = " two ";


        deck.deal(players);

//        int min = 0;
//        if (player1.cards.length < player2.cards.length) {
//            min = player1.cards.length;
//        } else {
//            min = player2.cards.length;
//        }

        System.out.println();
        check(0, 26);

        //presmqta broq specheleni karti
        int numOfCardsOfPlayerOne = result(receiveCards1);
        int numOfCardsOfPlayerTwo = result(receiveCards2);

        //print
        System.out.println("Player1 has " + numOfCardsOfPlayerOne + " cards");
        System.out.println("Player2 has " + numOfCardsOfPlayerTwo + " cards");

        //proverka za poveche karti
        if (numOfCardsOfPlayerOne > numOfCardsOfPlayerTwo) {
            System.out.println("Player1 is winner !");
        } else if (numOfCardsOfPlayerOne < numOfCardsOfPlayerTwo) {
            System.out.println("Player2 is winner !");
        } else {
            System.out.println("No winner");
        }

    }

    //samata igra : proverka koi pecheli kartite
    private void check(int i, int numofCards) {

        if (i >= numofCards) {
            return ;
        }



        System.out.println("Hand" + (i + 1));
        System.out.println("Player1: " + players[0].cards[i]);
        System.out.println("Player2: " + players[1].cards[i]);

        //ako 1q ima po-silna karta
        if (strengthGet(players[0].cards[i]) > strengthGet(players[1].cards[i])) {

            System.out.println("Player1 get this hand ");
            System.out.println();

            for (int k = 0; k <= numOfIteration; k++) {
                receiveCards1[countPlayer1] = players[0].cards[i - k];
                countPlayer1++;
                receiveCards1[countPlayer1] = players[1].cards[i - k];
                countPlayer1++;
            }

            numOfIteration = 0;
            numOfRecursion = 0;

             check(i+1,26);

        //ako 2riq ima po-silna karta
        } else if (strengthGet(players[0].cards[i]) < strengthGet(players[1].cards[i])) {

            System.out.println("Player2 get this hand ");
            System.out.println();

            for (int k = 0; k <= numOfIteration; k++) {
                receiveCards2[countPlayer2] = players[0].cards[i - k];
                countPlayer2++;
                receiveCards2[countPlayer2] = players[1].cards[i - k];
                countPlayer2++;

            }
  
            numOfIteration = 0;
            numOfRecursion = 0;

             check(i+1,26);

        //voina
        } else {
            System.out.print("War ! ");
            numOfRecursion++;

            if (i < 23  && numOfRecursion <= 1) {
                //pri 1va voina

                numOfCardsInWar = 3;
                numOfIteration = numOfCardsInWar;
                i = i + numOfCardsInWar;
                System.out.println("Check hand " + (i + 1) + " !");

            } else if (i == 25) {
                //ako kartata e posledna
                
                System.out.println("This is the last hand! No one gets these cards :) ");
                return ;

            } else {
                //!!!ako sa ostanali po malko ot 3 karti nakraq igraem voina samo s po 1 karta !
                // ili ako voinata e poredna proverqvame samo po 1 karta
                
                numOfCardsInWar = 1;
                numOfIteration += numOfCardsInWar;
                i = i + numOfCardsInWar;

                System.out.println("Check hand " + (i + 1) + " !");
            }
            
            check(i, i+1);
        }


    }

    //prisvoqvame si cifrova sila
    private int strengthGet(Card card) {
        int result = 0;
        if (card.getStrength().equals("two")) {
            result = 2;
        } else if (card.getStrength().equals("three")) {
            result = 3;
        } else if (card.getStrength().equals("four")) {
            result = 4;
        } else if (card.getStrength().equals("five")) {
            result = 5;
        } else if (card.getStrength().equals("six")) {
            result = 6;
        } else if (card.getStrength().equals("seven")) {
            result = 7;
        } else if (card.getStrength().equals("eight")) {
            result = 8;
        } else if (card.getStrength().equals("nine")) {
            result = 9;
        } else if (card.getStrength().equals("ten")) {
            result = 10;
        } else if (card.getStrength().equals("jack")) {
            result = 11;
        } else if (card.getStrength().equals("queen")) {
            result = 12;
        } else if (card.getStrength().equals("king")) {
            result = 13;
        } else if (card.getStrength().equals("ace")) {
            result = 14;
        }

        //tova ne raboti ! qvno nqmam java 8
//		switch (card.getStrength()) {
//		case "two":
//			result = 2;
//			break;
//		case "three":
//			result = 3;
//			break;
//		case "four":
//			result = 4;
//			break;
//		case "five":
//			result = 5;
//			break;
//		case "six":
//			result = 6;
//			break;
//		case "seven":
//			result = 7;
//			break;
//		case "eight":
//			result = 8;
//			break;
//		case "nine":
//			result = 9;
//			break;
//		case "ten":
//			result = 10;
//			break;
//		case "jack":
//			result = 11;
//			break;
//		case "queen":
//			result = 12;
//			break;
//		case "king":
//			result = 13;
//			break;
//		case "ace":
//			result = 14;
//			break;
//
//		}
        return result;

    }

    //broim spechelenite karti
    public int result(Card[] cards) {
        int result = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                result++;
            }
        }
        return result;

    }
}
