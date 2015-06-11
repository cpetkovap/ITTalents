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
public class Task07 {

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

        int[] arrFirst = new int[n];
        //input elements of array
        for (int i = 0; i < arrFirst.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arrFirst[i] = input.nextInt();
        }

        int[] arrSecond = new int[arrFirst.length];
        arrSecond[0] = arrFirst[1];
        for (int i = 2; i < arrFirst.length; i++) {
            arrSecond[i - 1] = arrFirst[i - 2] + arrFirst[i];
        }
        arrSecond[arrFirst.length - 1] = arrFirst[arrFirst.length - 2];

        //print
        System.out.println("New array :");
        for (int i = 0; i < arrSecond.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, arrSecond[i]);
        }

    }
}
