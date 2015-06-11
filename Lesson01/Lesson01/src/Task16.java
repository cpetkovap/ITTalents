
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task16 {
    public static void main(String argc[]){
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
            if(a == b && b== c){
                System.out.println("Cifrite sa ravni");
            }else if(a > b && b > c){
                System.out.println("Vyzhodqsht red");
            }else if(a < b && b < c){
                System.out.println("Nizhodqsht red");
            }else{
                System.out.println("Ne sa naredeni");
            }
        }

    }
}
