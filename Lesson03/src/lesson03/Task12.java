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
public class Task12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // array
        int n = 7;
        int[] arr = new int[n];
        //input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }

        //swap
        int c = arr[0];
        arr[0] = arr[1];
        arr[1] = c;

        arr[2] += arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] -= arr[3];

        arr[4] *= arr[5];
        arr[5] = arr[4] / arr[5];
        arr[4] /= arr[5];

        //print result
        System.out.println("Result");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, arr[i]);
        }
    }
}
