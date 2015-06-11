
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task1 {
    public static void main(String... argc){
        // declare sccaner
        Scanner input = new Scanner(System.in);

        //input variables
        System.out.print("Enter double variable : ");
        double firstVariable = input.nextDouble();
        System.out.print("Enter double variable : ");
        double secondVariable = input.nextDouble();
        System.out.print("Enter double variable : ");
        double thitdVariable = input.nextDouble();

        //if statment
        if(thitdVariable > firstVariable && thitdVariable < secondVariable){
            System.out.printf("The variable %.2f is between %.2f and %.2f ", thitdVariable, firstVariable, secondVariable);
        }else{
            System.out.printf("The variable %.2f is NOT between %.2f and %.2f ", thitdVariable, firstVariable, secondVariable);
        }
    }

}
