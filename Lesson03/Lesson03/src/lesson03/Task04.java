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
public class Task04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter lenght of array : ");
            n = input.nextInt();
        } while (n < 1);

        int[] arr = new int[n];
        int s = arr.length - 1;
        boolean result = true;

        //input array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[s]) {
                result = false;
                break;
            }
            s--;
        }
        if (result) {
            System.out.println("Ogledalen");
        } else {
            System.out.println("Ne e ogledalen");
        }

    }
}
