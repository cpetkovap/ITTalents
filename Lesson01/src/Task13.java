
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task13 {
    public static void main(String argc[]){
         //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable between -100 and 100: ");
        int var = input.nextInt();

        if(var < -100 || var > 100){
            System.out.println("Error");
        }else{
            if(var >= - 100 && var <= -20){
                System.out.println("Ledeno studeno");
            }else if(var > - 20 && var <= 0){
                System.out.println("Studeno");
            }if(var > 0 && var <= 15){
                System.out.println("Hladno");
            }if(var > 15 && var <= 25){
                System.out.println("Toplo");
            }if(var > 25 && var <= 100){
                System.out.println("Goreshto");
            }
        }

    }
}
