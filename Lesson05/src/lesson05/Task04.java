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
public class Task04 {

    public static void main(String[] argv) {
        //Scanner
        Scanner input = new Scanner(System.in);
        String names;

        /*
         *Programkata e napravena za vyvedeni 2 ili poveche imena razdeleni sys zapetaq
         *Ne zadyljitelno 2
         */

        
        //proverka na vhoda
        do {
            System.out.print("Vyuvedete 3te imena na 2ma ili poveche choveka razdeleni sys zapetaq ");
            names = input.nextLine();
        } while (!names.matches("[A-Z][a-z]+[ ][A-Z][a-z]+[ ][A-Z][a-z]+"
                + "([ ]?[,][ ]?[A-Z][a-z]+[ ][A-Z][a-z]+[ ][A-Z][a-z]+)+"));
        //System.out.println(names);

        //razdelqme vyvedenite danni
        String[] s = names.split(",");
        for (int i = 0; i < s.length; i++) {
            //mahame space-ove
            s[i] = s[i].trim();
            //System.out.println(s[i]);
        }

        //namirame sumata na ascii kodovete na vsqko ot vyvedenite imena
        int[] sum = new int[s.length];
        for (int k = 0; k < sum.length; k++) {
            for (int i = 0; i < s[k].length(); i++) {
                sum[k] += (int) s[k].charAt(i);
            }
        }

        //namirame nai golqmoto takova
        int max = 0;
        int index = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                index = i;
            }
        }

        //print
        System.out.println(s[index]);


    }
}
