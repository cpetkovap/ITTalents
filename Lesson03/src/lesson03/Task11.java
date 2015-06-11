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
public class Task11 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Sccaner
        Scanner input = new Scanner(System.in);

        // array
        int n = 7;
        int[] arr = new int[n];
        //input elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Arr[%d] = ", i + 1);
            arr[i] = input.nextInt();
        }

        int count = 0;
        //print
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 5 && arr[i] % 5 ==0){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println(count + " chisla kratni na 5, no > ot 5 " );
    }
}
