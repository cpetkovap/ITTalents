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
public class Task09 {

    public static void main(String[] argv) {
        //scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter String : ");
        String s = input.next();
        //s = s.replaceAll("(\\D)*", " ");
        s = s.replaceAll("-", " -");
        s = s.replaceAll("[^-?0-9]+", " ");
        s = s.trim();

        String[] num = s.split(" ");
        int sum = 0;
        String a;
        
        //output
        System.out.println("Result : ");
        for (int i = 0; i < num.length; i++) {
            a = num[i].trim();
            int f = Integer.parseInt(a);
            System.out.println(f);
            sum += f;
        }
        System.out.println("Sum = " + sum);


    }
}
