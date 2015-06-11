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
public class Task06 {
    public static void main(String[] argv) {
        //scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter sentance : ");
        String s = input.nextLine();

        String[] newS = s.split(" ");
        for(int i = 0; i < newS.length; i++){
            char a = newS[i].charAt(0);
            System.out.print(newS[i].replace(a, Character.toUpperCase(a))+ " ");
        }


    }

}
