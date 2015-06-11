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
public class Task21 {

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        int n;


        //input
        do {
            System.out.print("Enter int variable between 1 and 52 : ");
            n = input.nextInt();
        } while (n < 1 || n > 52);

        for (int i = n ; i <= 52; i++) {
            int card = i - 1 ;
            //System.out.print(card + " ");
            switch(card / 4){
                case 0: System.out.print( "2ka " );break;
                case 1: System.out.print( "3ka " );break;
                case 2: System.out.print( "4ka " );break;
                case 3: System.out.print( "5ca " );break;
                case 4: System.out.print( "6ca " );break;
                case 5: System.out.print( "7ca " );break;
                case 6: System.out.print( "8ca " );break;
                case 7: System.out.print( "9ka " );break;
                case 8: System.out.print( "10ka " );break;
                case 9: System.out.print( "Vale " );break;
                case 10: System.out.print( "Dama " );break;
                case 11: System.out.print( "Pop " );break;
                case 12: System.out.print( "Aso " );break;
            }
            //card = i ;
              switch(card % 4){
                case 0: System.out.print( "spatiq " );break;
                case 1: System.out.print( "karo " );break;
                case 2: System.out.print( "kupa " );break;
                case 3: System.out.print( "pika " );break;
            }
              if( 52 - i !=0){
                System.out.print(", ");
              }

            

        }
//            for (int j = 2; j <= 4; j++) {
//                if (card % j == 0) {
//                    System.out.print(j + " ");
//
//                }
//            }


//            System.out.println();
//        }

    }
}
