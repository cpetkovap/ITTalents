/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task06 {

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

        //arr elements = sum of each even row
        int[] sum = new int[arr.length / 2];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum[k] += arr[i][j];
                }
                k++;
            }
        }

        //print
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[(i * 2) + 1][j] + " ");
            }
            System.out.print("sum = " + sum[i]);
            System.out.println();
        }

        //sum of all elements in even row
        int all = 0;
        for (int i = 0; i < sum.length; i++) {
            all += sum[i];
        }
        System.out.println("All = " + all);
    }
}
