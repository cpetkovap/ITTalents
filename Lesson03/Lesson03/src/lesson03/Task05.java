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
public class Task05 {

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, arr[i]);
        }
    }
}
