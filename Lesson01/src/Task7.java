
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task7 {
     public static  void  main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable for hour, a = ");
        int hour = input.nextInt();
        System.out.print("Enter int double for sum of money, b = ");
        double sum = input.nextDouble();
        System.out.print("Enter int boolean for healthy, b = ");
        boolean healthy = input.nextBoolean();

        //if
        if(healthy == false){
            System.out.println("Do not go out");
            if(sum != 0){
                System.out.println("I will buy medicines");
            }else{
                System.out.println("I will stay at home and drink tea");
            }
        }else{
            if(sum > 10){
                System.out.println("I will go to cinema with friend");
            }else{
                System.out.println("I will go to coffee");
            }
        }


    }
}
