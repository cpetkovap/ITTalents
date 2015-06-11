/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task04 {

    public static void main(String[] argc) {
        //arr
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        //print original arr
        System.out.println("Arr : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //create new arr
        int [][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = arr[arr.length - j - 1][i];
            }
        }

        //print new arr
        System.out.println();
        System.out.println("New arr : ");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
