/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Cvety
 */
public class Task14 {

    public static void main(String[] args) {
        // TODO code application logic here

        double[] arr = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};

        int count = 0; // broim zapetaiki --> malko tromavo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= -2.99 && arr[i] <= 2.99) {
                count++;
            }
        }

        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= -2.99 && arr[i] <= 2.99) {
                System.out.print(arr[i]);
                count2++;
                if (count2 < count) {
                    System.out.print("; ");
                }
            }
        }
    }
}
