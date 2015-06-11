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
public class Task09 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Sccaner
        Scanner input = new Scanner(System.in);

        // array
        int n;
        do {
            System.out.print("Enter lenght of  array : ");
            n = input.nextInt();
        } while (n < 1);

        int[] arr = new int[n];
        //input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }
        int k = arr.length - 1;
        int s = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            s = arr[i];
            arr[i] = arr[k];
            arr[k] = s;
            k--;
        }
        //print
        System.out.println("New array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, arr[i]);
        }

    }
}
