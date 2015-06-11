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
public class Task08 {

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


        int l = 1;
        int in = 1;
        int max = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                l++;

            } else {

                l = 1;

            }
            if (max < l) {
                max = l;
                if (arr[in] != arr[i]) {
                    in = i;
                }
            }
        }


        System.out.println("Nai dylgata poredica zapochva ot element " + in + " i ima dyljina " + max);
    }
}
