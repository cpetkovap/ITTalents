
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task11 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable: ");
        int var = input.nextInt();
        int a, b, c;

        //if
        if (var < 100 || var > 999) {
            System.out.println("Error");
        } else {
            a = var / 100;
            b = var / 10 % 10;
            c = var % 10;
            //System.out.println(a);
            //System.out.println(b);
            //System.out.println(c);
            if(a == 0 || b == 0 || c == 0){
                System.out.println("Error");
            }else{
                if(var % a == 0 && var % b == 0 && var % c == 0){
                     System.out.println("Deli se");
                }else{
                     System.out.println("Ne se deli");
                }
            }
        }
    }
}
