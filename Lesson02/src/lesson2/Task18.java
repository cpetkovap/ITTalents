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
public class Task18 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int a, b;

        //input variable
        do {
            System.out.print("Enter int variable between 1 and 9 : ");
            a = input.nextInt();
        } while (a < 1 || a > 9);
        do {
            System.out.print("Enter int variable between 1 and 9 : ");
            b = input.nextInt();
        } while (b < 1 || b > 9);

        //for
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf(" %d * %d = %d \n", i, j, i * j);
            }
        }
    }
}
