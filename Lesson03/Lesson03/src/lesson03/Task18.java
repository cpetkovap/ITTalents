/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Cvety
 */
public class Task18 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrFirst = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] arrSecond = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};

        //new int
        int length = (arrFirst.length > arrSecond.length ? arrFirst.length : arrSecond.length);
        int[] result = new int[length];

        //incializirane moviq masiv
        for (int i = 0; i < result.length; i++) {
            if (arrFirst[i] > arrSecond[i]) {
                result[i] = arrFirst[i];
            } else {
                result[i] = arrSecond[i];
            }
        }

        //print
        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("Arr[%d] = %d \n", i + 1, result[i]);
        }



    }
}
