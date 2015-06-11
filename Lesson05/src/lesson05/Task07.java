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
public class Task07 {
    public static void main(String[] argv) {
        //scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter sentance : ");
        String s = input.nextLine();

        String[] newS = s.split(" ");

        int max = 0;
        int index = -1;
        for(int i = 0; i < newS.length; i++){
            if(newS[i].length() > max){
                max = newS[i].length();
                index = i;
            }
        }

        System.out.printf("%d dumi, nai dylgata e s %d simvola: %s ", newS.length, max, newS[index]);
    }
}
