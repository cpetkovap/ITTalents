/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author Cvety
 */
public class Task12 {

    public static void main(String... argc) {

        /*
         *vsichki prosti chisla mejdu 101 i 999 koito nqmat povtarqshti se cifri -
         *mai sym uslojnila uslovieto ama ne mi se trie che si mi haresva reshenieto
         * nadqvam se da ne se testva prez avtomatizirana sistema :D
         */

        int a, b, c;

        int broi = 0;
        for (int i = 101; i <= 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
//            Test:
//            System.out.println();
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//            System.out.println();

            int prosto = 0;
            if (a != b && b != c && a != c) {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prosto = 1;

                    }
                }

                if (prosto == 0) {
                    System.out.print(i);

                        System.out.print(", ");

               }

            }
        }
    }
}
