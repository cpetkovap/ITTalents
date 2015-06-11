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
public class Task01 {

    public static void main(String[] argv) {
        //Scanner
        Scanner input = new Scanner(System.in);
        String s1, s2;

        //check
        do {
            System.out.print("Enter String with lenght < 40 ");
            s1 = input.nextLine();
        } while (s1.length() > 40);

        do {
            System.out.print("Enter another String with lenght < 40 ");
            s2 = input.nextLine();
        } while (s2.length() > 40);

        //print
        System.out.printf("Output : %s %s %s %s \n",
                s1.toUpperCase(), s1.toLowerCase(), s2.toUpperCase(), s2.toLowerCase());


    }
}
