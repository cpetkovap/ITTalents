
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task2 {
    public static void main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable: ");
        int a = input.nextInt();
        System.out.print("Enter int variable: ");
        int b = input.nextInt();

        //calculation
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;

        //print
        System.out.printf(" %d + %d = %d \n", a, b, sum);
        System.out.printf(" %d - %d = %d \n", a, b, difference);
        System.out.printf(" %d * %d = %d \n", a, b, multiplication);
        if(b != 0){
            double partition = (double) a / b;
            System.out.printf(" %d / %d = %.4f ", a, b, partition);
        }else{
            System.out.println("can not partition by zero");
        }


    }

}
