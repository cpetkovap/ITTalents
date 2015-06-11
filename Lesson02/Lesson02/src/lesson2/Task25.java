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
public class Task25 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int a;
        int result = 1;
        //input variable

        do {
            System.out.print("Enter int variable > 0 : ");
            a = input.nextInt();
        } while (a < 1 );

        do{
            result *= a;
            a--;
        }while(a >= 1);

        System.out.printf("Result = %d", result);
    }
}
