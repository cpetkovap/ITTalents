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
public class Task16 {
    public static void main(String argc[]){
        //Scanner
        Scanner input = new Scanner(System.in);
        int a,b;

        //input variable
        do{
            System.out.print("Enter int variable beween 10 and 5555: ");
            a = input.nextInt();
        }while(a < 10 || a > 5555 );
        
         do{
            System.out.print("Enter int variable beween 10 and 5555: ");
            b = input.nextInt();
        }while(b < 10 || b > 5555 );
        
        //swap
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }
        
        for(int i = b; i >= a; i--){
            if(i % 50 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        
        }

    }
}
