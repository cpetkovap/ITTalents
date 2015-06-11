/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Cvety
 */
public class Task02 {

    public static void main(String[] args) {
        // TODO code application logic here
        //arrays
        int[] arr = {10, 3, 5, 8, 6, -3, 7, 12, 4};
        int[] newArr = new int[arr.length];
        int i;

        //konstruirame nov masiv
        for (i = 0; i < arr.length / 2; i++) {
            newArr[i] = arr[i];
        }
        //proverka za chetnost na broq na elementi
        if (arr.length % 2 == 0) {
            for (int j = arr.length - 1; j >= arr.length / 2; j--) {
                newArr[i] = arr[j];
                i++;
            }
        } else {
            newArr[i] = arr[i];
            for (int j = arr.length - 1; j > arr.length / 2; j--) {
                i++;
                newArr[i] = arr[j];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(newArr[j]);
        }
    }
}
