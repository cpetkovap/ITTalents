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
public class Task11 {
    public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int n = input.nextInt();

        //for
        for(int i = 1; i <= n ; i++){
             for(int j = n - i; j >= 1  ; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1  ; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
