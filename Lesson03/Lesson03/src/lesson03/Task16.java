/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03;

/**
 *
 * @author Cvety
 */
public class Task16 {

    public static void main(String[] args) {
        // TODO code application logic here

        double[] arr = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};

        //1. Извежда съществуващите числа.
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %.02f \n", i + 1, arr[i]);
        }

        // 2.Замяна
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < -0.231) {
                arr[i] = (i + 1) * (i + 1) + 41.25;
            } else {
                arr[i] *= (i + 1);
            }
        }

        System.out.println();

        //3. Извеждане
        System.out.println("Nov masiv : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = %.02f \n", i + 1, arr[i]);
        }

        //4.Средна стойност
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sum += arr[i];
                count++;
            }
        }

        System.out.println();
        System.out.println("Result : " + sum / count);



    }
}
