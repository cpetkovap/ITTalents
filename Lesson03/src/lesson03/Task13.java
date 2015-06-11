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
public class Task13 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter variable : ");
        int n = input.nextInt();

        // calculate length of array
        int length = 0;
        int copyN = n;
        while (copyN != 0) {

            copyN = copyN >> 1;
            length++;

        }

        //System.out.println(length);
        int[] arr = new int[length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (n & 1);
            n = n >> 1;
        }
        System.out.print("Result : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
