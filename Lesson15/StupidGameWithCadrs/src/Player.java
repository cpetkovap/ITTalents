import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Player {
	Card cards[];
	Random rand = new Random();
	Scanner input =new Scanner(System.in);
	String name;

	public Player(String name) {
		cards = new Card[26];
		this.name= name;
	}

	
	
	public void print(){
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
		}
		System.out.println();
		
	}

}
