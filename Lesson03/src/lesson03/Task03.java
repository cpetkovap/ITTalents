/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Task03 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner
        Scanner input = new Scanner(System.in);

        //array
        int[] arr = new int[10];

        //vyvejdane na 1vite 2 chisla ot masiva
        System.out.print("Enter int variable : ");
        int a = input.nextInt();
        arr[0] = a;
        arr[1] = a;

        //for
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        //print
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, arr[i]);
        }

    }
}
