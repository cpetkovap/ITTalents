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
public class Task15 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        //input variable
        do {
            System.out.print("Enter int variable : ");
            n = input.nextInt();
        } while (n < 1);

//        for(int i = 1; i <= n; i++){
//            sum += i;
//        }
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= n);

        System.out.printf("sum = %d \n", sum);
    }
}
