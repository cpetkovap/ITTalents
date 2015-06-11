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
public class Task02 {

    public static void main(String[] argv) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //String s1, s2;
        StringBuilder s1 ;
        StringBuilder s2 ;
        
        //vyvejdame dokato vsqko e s dyljina po golqma ot 5 i obshtata dyljina e mejdu [10,20]
        do {
            System.out.print("Enter String : ");
            s1 = new StringBuilder(input.next());
            System.out.print("Enter another String : ");
            s2 = new StringBuilder(input.next());
        } while (s2.length() + s1.length() < 10 || s2.length() + s1.length() > 20
                || s1.length() < 5 || s2.length() < 5);

        //swap
        StringBuilder s3 = new StringBuilder(s2);
        s2.replace(0, 5, s1.toString().substring(0, 5));
        s1.replace(0, 5, s3.toString().substring(0, 5));
       
        

        //printirame po dylgata dyljina
        if (s1.toString().length() > s2.toString().length()) {
            System.out.print(s1.toString().length() + " ");
        } else {
            System.out.print(s2.toString().length() + " ");
        }

        //printirame razmenenite veche stoinosti
        System.out.print(" " + s1.toString() + " " + s2.toString());
        

    }
}
