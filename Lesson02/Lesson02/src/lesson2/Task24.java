/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author Cvety
 */
public class Task24 {

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;
        int a, b;
        boolean result = true;

        //input variable
        do {
            System.out.print("Enter int variable between 10 and 30000 : ");
            n = input.nextInt();
        } while (n < 10 || n > 30000);

        int k = n;
        int sum = 0;

        //dyljina na vyvedenoto
        while (k > 0) {
            k = k / 10;
            sum++;
        }

        //System.out.println(sum);
        int c = 1;
        for(int i = 1 ; i < sum; i++){
            c *= 10;
        }
        //System.out.println(c);
        int newN = n;
         for(int i = 1 ; i <= sum; i++){
            a = n/c%10;
            c /= 10;
            //System.out.println(a);

            b = newN % 10;
            newN = newN/10;
            //System.out.println(b);

            if(a != b){
                result = false;
                break;
            }
        }


        if(result){
            System.out.println("Palindron");
        }else{
           System.out.println("Ne e palindron");
        }
    }
}
