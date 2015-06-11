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
public class Task17 {
    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int a;

        //input variable
        do {
            System.out.print("Enter int variable between 3 and 20 : ");
            a = input.nextInt();
        } while (a < 3 || a > 20);

        System.out.print("Enter char : ");
        char c = input.next().charAt(0);
        
        //for loop
        for(int i = 1; i <= a; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= a - 2; i++){
            System.out.print("*");
            for(int j = 2; j <= a-1; j++){
                System.out.print(c);
            }
            System.out.print("*");
            System.out.println();

        }
         for(int i = 1; i <= a; i++){
            System.out.print("*");
        }
        System.out.println();

    }

}
