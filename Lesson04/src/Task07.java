/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task07 {

    public static void main(String[] argc) {

        //arr
        int[][] arr = {
            {11, 12, 13, 14, 15, 16},
            {21, 22, 23, 24, 25, 26},
            {31, 32, 33, 34, 35, 36},
            {41, 42, 43, 44, 45, 46},
            {51, 52, 53, 54, 55, 56},
            {61, 62, 63, 64, 65, 66}
        };


        int[] arrSum = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arrSum[k] += arr[i][j];
                }
            }
            k++;
        }

        //print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
            System.out.print("Sum = " + arrSum[i]);
            System.out.println();
        }

        //all sum
        int sum = 0;
        for (int i = 0; i < arrSum.length; i++) {
            sum += arrSum[i];
        }

        System.out.println("All = " + sum);


    }
}
