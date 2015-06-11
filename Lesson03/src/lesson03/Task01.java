/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Cvety
 */
public class Task01 {

    public static void main(String[] args) {
        // TODO code application logic here

        //array
        int[] arr = {10, 3, 5, 8, 6, -3, 7};
        int min = -1;

        //tyrsim nai malko chislo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                if (arr[i] < min) {
                    min = arr[i];
                }

            }
        }

        if (min == -1) {
            System.out.println("Nqma chislo kratno na 3");
        } else {
            System.out.println("Nai-malkoto chislo kratno na 3 e " + min);
        }
    }
}
