
/**
 *
 * @author Cvety
 */
public class Demo {

    public static void main(String[] args) {
        
        Player player1 = new Player("Mariika");
        Player player2 = new Player("Ivanco");
        Play play = new Play(player1, player2);
        play.game();
        
    }
}
