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
public class Task7 {
        public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int n = input.nextInt();


        //for
        for(int i = 1 ; i <= n ; i++){
             System.out.printf("Result %d = %d \n", i , 3 * i);
        }

    }

}
