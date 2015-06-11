/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson2;

import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Task6 {

    public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int a = input.nextInt();
        int sum = 0;

        //for
        for(int i = 1 ; i <= a ; i++){
            sum = sum + i;
        }
        System.out.printf("Sum = %d \n", sum);
    }
}
