/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson05;

import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Task08 {
     public static void main(String[] argv) {
        //scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter String : ");
        String s = input.next();

        boolean result = true;
        int k = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != s.charAt(k)){
                result = false;
            }
            k++;
        }
        if(result){
            System.out.println("Palindrome !");
        }else{
            System.out.println("NOT palindrome !");
        }

     }

}
