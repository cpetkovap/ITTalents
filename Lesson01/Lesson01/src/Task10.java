
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task10 {
    public static void main(String... argc){
        // declare sccaner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable, a = ");
        int a = input.nextInt();

        if(a < 10 || a > 9999){
            System.out.println("Error");
        }else{
            int k = a /5;
            int s = a % 5;
            System.out.printf("%d kofi po 3 listra i %d kofi po 2 litra \n", k,k);
            if(s / 4 == 1){
                System.out.print("Dopylnitelno 2 kofi ot po 2 litra ");
            }else if(s / 3 == 1){
                System.out.print("Dopylnitelno kofa ot 3 litra ");
            }else if(s / 2 == 1){
                System.out.print("Dopylnitelno kofa ot 2 litra ");
            }else if(s / 1 == 1){
                System.out.println("E tozi 1 lityr ne znam kyde da go sloja");
            }else{
            }
        }
    }

}
