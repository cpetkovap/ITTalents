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
public class Task8 {
    public static void  main(String[] argc){
         //Scanner
        Scanner input = new Scanner(System.in);
        int n;

        //input
        do {
            System.out.println("Enter n : ");
            n = input.nextInt();
        } while (n < 1 );

        int printValue = n-1;
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= n; j++){
                System.out.print(printValue );
            }
            printValue += 2;

            System.out.println();
        }

    }

}
