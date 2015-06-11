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
public class Task17 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // array
        int n;
        do {
            System.out.print("Enter lenght of  array : ");
            n = input.nextInt();
        } while (n < 1);
        int[] arr = new int[n];

        //add elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }

        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    result = false;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    result = false;
                }
            }
        }

        if (result) {
            System.out.print("изпълнява изискванията за зигзагообразна нагоре редица");
        } else {
            System.out.print("НЕ изпълнява изискванията за зигзагообразна нагоре редица");
        }
    }
}
