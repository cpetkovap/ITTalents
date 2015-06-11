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
public class Task19 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);
        double a;

        //input variable

        do {
            System.out.print("Enter int variable between 10 and 99 : ");
            a = input.nextInt();
        } while (a < 10 || a > 99);

        do {
            if ((a - 1) % 2 == 0) {
                a = (double) ((3 * a) + 1);
                System.out.print((int)a + " ");
            } else {
                a = 0.5 * a;
                System.out.print((int)a + " ");
            }
        } while (a != 1);

    }
}
