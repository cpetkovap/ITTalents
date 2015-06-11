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
public class Task14 {
    public static void main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;
        //input variable
        do{
            System.out.print("Enter int variable : ");
            n = input.nextInt();
        }while(n < 10 || n > 200 );

        for(int i = n; i >= 1; i--){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
