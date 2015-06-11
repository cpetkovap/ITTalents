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
public class Task13 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;
        //input variable
        do {
            System.out.print("Enter int variable : ");
            n = input.nextInt();
        } while (n < 2 || n > 27);
        int a, b, c;

        for (int i = 0; i <= 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (a + b + c == n) {
                System.out.print(i);

                System.out.print(" ");

            }

        }

    }
}
