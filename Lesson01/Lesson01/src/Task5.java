
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task5 {
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

        //print
        if(a < b && b < c){
            System.out.printf("Result : %d ,%d, %d ", c, b, a);
        }else if(a < c && c < b){
            System.out.printf("Result : %d ,%d, %d ", b, c, a);
        }else if(b < c && c < a){
            System.out.printf("Result : %d ,%d, %d ", a, c, b);
        }else if(b < a && a < c){
            System.out.printf("Result : %d ,%d, %d ", c, a, b);
        }else if(c < b && b < a){
            System.out.printf("Result : %d ,%d, %d ", a, b, c);
        }else if(c < a && a < b){
            System.out.printf("Result : %d ,%d, %d ", b, a, c);
        }
    }

}
