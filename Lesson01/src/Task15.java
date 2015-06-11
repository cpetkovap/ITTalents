
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task15 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable between 0 and 24 : ");
        int var = input.nextInt();

        if (var < 0 || var > 24) {
            System.out.println("Error");
        } else {
            if(var >= 4 && var <= 9){
                System.out.println("Dobro utro");
            }else if(var > 9 && var <= 18){
                System.out.println("Dobro den");
            }else if((var > 18 && var <= 24) || (var >= 0 && var < 4)){
                System.out.println("Dobyr vecher");
            }
        }
    }
}
