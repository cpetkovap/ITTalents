/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task03 {

    public static void main(String[] argc) {

        //arr
        int[][] arr = {{48, 72, 13, 14, 15},
            {21, 22, 53, 24, 75},
            {31, 57, 33, 34, 35},
            {41, 95, 43, 44, 45},
            {59, 52, 53, 54, 55},
            {61, 69, 63, 64, 66}};

        int sum = 0;
        int len = 0;

        //sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                len++;
            }
        }

        System.out.printf("Suma = %d \nBroi elementi = %d \nSredno = %f \n", sum, len, (double) sum / len);
    }
}
