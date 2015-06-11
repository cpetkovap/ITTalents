/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson2;

/**
 *
 * @author Cvety
 */
public class Task23 {
    public static void main(String[] args) {

        int i = 0;
        int j;
        while(i < 9){
            i++;
            //redifine j
            j = 0;
            while(j < 9){
                j++;
                if(j<i){
                    continue;
                }
                System.out.printf("%d * %d = %d ", i, j, i * j );
//                System.out.print(i +" "+ j + " ");
//                System.out.println();
            }
            System.out.println();
        }
    }
}
