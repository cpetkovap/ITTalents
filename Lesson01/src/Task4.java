
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task4 {
     public static  void  main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable, a = ");
        int a = input.nextInt();
        System.out.print("Enter int variable, b = ");
        int b = input.nextInt();

        //print
        if(a > b){
            System.out.printf("Result : %d ,%d ", b, a);
        }else{
            System.out.printf("result : %d ,%d ", a, b);
        }
    }

}
