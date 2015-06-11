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
public class Task9 {

    public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int a = input.nextInt();
        System.out.print("Enter int variable : ");
        int b = input.nextInt();

        //swap
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        for (int i = a; i <= b; i++) {
            if (i !=  b) {
                if (i % 3 == 0) {
                    System.out.print("skip");
                    System.out.print(i);
                    System.out.print(" , ");
                } else {
                    System.out.print(i * i);
                    System.out.print(" , ");
                }
            }else{
                if (i % 3 == 0) {
                    System.out.print("skip");
                    System.out.print(i);
                } else {
                    System.out.print(i * i);
                }
            }
        }
    }
}
