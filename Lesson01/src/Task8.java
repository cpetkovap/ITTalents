
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task8 {

    public static void main(String... argc) {
        // declare sccaner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable with 4 digits : ");
        int var = input.nextInt();

        //if
        if (var < 1000 || var > 9999) {
            System.out.println("Error");
        } else {
            //calculate a and b
            int a = (var / 1000) * 10 + (var % 10);
            int b = ((var / 100) % 10) * 10 + (var / 10 % 10);

            //if
            if (a < b) {
                System.out.printf("%d < %d ", a, b);
            } else if (a > b) {
                System.out.printf("%d > %d ", a, b);
            } else {
                System.out.printf("%d = %d ", a, b);
            }
        }

        //System.out.println(a);
        //System.out.println(b);
    }
}
