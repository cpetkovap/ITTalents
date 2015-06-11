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
public class Task5 {

    public static void main(String... argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input variable
        System.out.print("Enter int variable : ");
        int a = input.nextInt();
        System.out.print("Enter int variable : ");
        int b = input.nextInt();

        //swap
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }

        for(int i = a ; i <= b ; i++){
            System.out.print(i + " ");
        }
    }
}
