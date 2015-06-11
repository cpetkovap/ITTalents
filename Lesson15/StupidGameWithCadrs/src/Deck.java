
import java.util.Random;

/**
 *
 * @author Cvety
 */

public class Deck {
	Card deck[];
	Random rand = new Random();
	int count = 0;

	public Deck() {

		deck = new Card[52];
		
		for(int i = 0; i < deck.length; i++){
			Card newCard = new Card();
			deck[i] = newCard; 
			if(i /4  == 0){
				deck[i].setStrength("two");
			}else if(i /4 == 1){
				deck[i].setStrength("three");
			}else if(i /4 == 2){
				deck[i].setStrength("four");
			}else if(i /4 == 3){
				deck[i].setStrength("five");
			}else if(i /4 == 4){
				deck[i].setStrength("six");
			}else if(i /4 == 5){
				deck[i].setStrength("seven");
			}else if(i /4 == 6){
				deck[i].setStrength("eight");
			}else if(i /4 == 7){
				deck[i].setStrength("nine");
			}else if(i /4 == 8){
				deck[i].setStrength("ten");
			}else if(i /4 == 9){
				deck[i].setStrength("jack");
			}else if(i /4 == 10){
				deck[i].setStrength("queen");
			}else if(i /4 == 11){
				deck[i].setStrength("king");
			}else if(i /4 == 12){
				deck[i].setStrength("ace");
			}
			
			
			if((i % 4) == 0){
				deck[i].setColor("clubs");
			}else if(i % 4 == 1){
				deck[i].setColor("hearts");
			}else if(i % 4 == 2){
				deck[i].setColor("diamonds");
			}else if(i % 4 == 3){
				deck[i].setColor("spades");
			}
			
			
		}
		
		swap();
	}
	
	public void swap(){
		for(int i = 0 ; i < deck.length; i++){
			int j = rand.nextInt(52);
			Card help = deck[i];
			deck[i] = deck[j];
			deck[j] = help;
		}
		
		
		
	}
	
	public void print(){
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i].toString() + " ");
			
		}
	}
	
	
	public void deal(Player[] player){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 26; j++){
				player[i].cards[j] = dealOneCard();
				
				
			}
			
		}
	}

	public Card dealOneCard() {
		// TODO Auto-generated method stub
		Card result = deck[count] ;
		count++;
		//System.out.println(count);
		return result;
		
	}
	
	

}
