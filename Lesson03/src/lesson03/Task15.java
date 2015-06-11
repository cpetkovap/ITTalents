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
public class Task15 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // array
        int n;
        do {
            System.out.print("Enter lenght of  array : ");
            n = input.nextInt();
        } while (n < 1);
        double[] arr = new double[n];

        //add elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextDouble();
        }

        //na vsqka iteraciq namirame nai golqmoto chislo i go zamenqme s 0 v masiva
        int count = 3;
        while (count > 0) {
            int index = 0;
            double max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] *= -1;
                }
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }

            }
            System.out.print(arr[index] + " ");
            arr[index] = 0;
            count--;
        }



    }
}
