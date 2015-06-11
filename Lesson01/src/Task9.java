
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task9 {
     public static void main(String... argc){
        // declare sccaner
        Scanner input = new Scanner(System.in);

        //input variables
        System.out.print("Enter double variable with two digits : ");
        int firstVariable = input.nextInt();
        System.out.print("Enter double variable  with two digits  : ");
        int secondVariable = input.nextInt();
        int multiplication;
        int end;

        //if
        if((firstVariable > 99 || firstVariable < 10) || (secondVariable > 99 || secondVariable < 10)){
            System.out.println("Error");
        }else{
            multiplication = firstVariable * secondVariable;
            end = multiplication % 10;
            if(end % 2 == 0){
                System.out.printf("Result : %d , %d , chetna \n", multiplication , end);
            }else{
                System.out.printf("Result : %d , %d , nechetna \n", multiplication , end);
            }

        }
    }

}
