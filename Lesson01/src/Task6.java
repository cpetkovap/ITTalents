
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task6 {
     public static  void  main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable, a = ");
        int a = input.nextInt();
        System.out.print("Enter int variable, b = ");
        int b = input.nextInt();
        System.out.print("Enter int variable, b = ");
        int c = input.nextInt();

        //swap
        int d = a;
        a = b;
        b = c;
        c = d;

        //print
        System.out.printf("a = %d , b = %d , c = %d", a, b, c);

    }

}
