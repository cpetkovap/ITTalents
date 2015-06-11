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
public class Task05 {

    public static void main(String[] argv) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //enter strings
        System.out.print("Enter string : ");
        String s1 = input.next();
        System.out.print("Enter string : ");
        String s2 = input.next();

        //namirame indeksite na ednakvite elementi(ako ima takiva)
        boolean result = false;
        int indexX = -1;
        int indexY = -1;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    result = true;
                    indexX = i;
                    indexY = j;
                    break;
                }
            }
            if (indexX != -1) {
                break;
            }
        }

//        System.out.println(indexX);
//        System.out.println(indexY);

        //print result
        if (result) {
            for (int k = 0; k < indexX; k++) {
                for (int i = 0; i < indexY; i++) {
                    System.out.print(" ");
                }
                System.out.println(s1.charAt(k));
            }
            for (int k = 0; k < s2.length(); k++) {

                System.out.print(s2.charAt(k));
            }
            System.out.println();
            for (int k = indexX + 1; k < s1.length(); k++) {
                for (int i = 0; i < indexY; i++) {
                    System.out.print(" ");
                }
                System.out.println(s1.charAt(k));
            }

        } else {
            System.out.println("Nqmat obsht znnak");
        }

    }
}
