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
public class Task06 {

    public static void main(String[] args) {
        // TODO code application logic here

        //Sccaner
        Scanner input = new Scanner(System.in);

        //first array
        int n;
        do {
            System.out.print("Enter lenght of first array : ");
            n = input.nextInt();
        } while (n < 1);

        int[] arrFirst = new int[n];
        for (int i = 0; i < arrFirst.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arrFirst[i] = input.nextInt();
        }

        //second array
        int m;
        do {
            System.out.print("Enter lenght of second array : ");
            m = input.nextInt();
        } while (m < 1);

        int[] arrSecond = new int[m];
        for (int j = 0; j < arrSecond.length; j++) {
            System.out.printf("Arr[%d] = ", j + 1);
            arrSecond[j] = input.nextInt();
        }

        boolean result = true;
        if (arrFirst.length != arrSecond.length) {
            System.out.println("Razlichna razmernost");
        } else {
            for (int k = 0; k < arrFirst.length; k++) {
                if (arrFirst[k] != arrSecond[k]) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("Masivite sa ednakvi !!");
            } else {
                System.out.println("Masivite sa s ednakva razmernost no imat razlichni elementi.");
            }
        }


    }
}
