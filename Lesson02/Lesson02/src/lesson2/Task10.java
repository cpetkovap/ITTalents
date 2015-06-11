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
public class Task10 {

    public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int n = input.nextInt();
        int result = 0;


        //for
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = 1;
            }

        }
        if(result == 0){
            System.out.println("Prosto \n");
        }else{
            System.out.println("Ne e prosto \n");
        }
    }
}
