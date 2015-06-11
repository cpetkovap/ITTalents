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
public class Task22 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;

        //input
        do {
            System.out.print("Enter int variable between 1 and 999 : ");
            n = input.nextInt();
        } while (n < 1 || n > 999);

        int result = n + 1;
        int count = 0;
        while(count < 10){
            if((result % 2 ==0) || (result % 3 ==0) || (result % 5 ==0)){
                count++;
                System.out.printf("%d:%d ", count, result);
                if(count < 10){
                    System.out.print(", ");
                }
                
            }
            result++;
        }


    }
}
