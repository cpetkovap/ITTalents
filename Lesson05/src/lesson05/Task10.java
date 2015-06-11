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
public class Task10 {
    public static void main(String[] argv) {
        //scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter String : ");
        String s = input.next();

        //premestvane na simvoli
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            ch[i] = (char) (s.charAt(i) + 5);
        }

        //print
        System.out.print("Result : ");
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println();

    }

}
