/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author Cvety
 */
public class Task20 {

    public static void main(String[] args) {

        int k = 11;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
            System.out.print(k%10);
            k++;
         }
            k++;
            System.out.println();
        }
    }
}
