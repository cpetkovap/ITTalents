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
public class Task10 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Sccaner
        Scanner input = new Scanner(System.in);

        // array
        int n = 7;
        int[] arr = new int[n];
        //input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }
        //izchislqvame sredno
        int sredno = 0;
        for (int i = 0; i < arr.length; i++) {
            sredno += arr[i];
        }
        sredno /= arr.length;

        //proverka
        int min;
        if (arr[0] > sredno) {
            min = arr[0] - sredno;
        } else {
            min = sredno - arr[0];
        }
        int result = 0;
        int s;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > sredno) {
                s = arr[i] - sredno;
            } else {
                s = sredno - arr[i];
            }
            if (s < min) {
                min = s;
                result = i;

            }
        }
        System.out.println("Result : " + arr[result]);


    }
}
