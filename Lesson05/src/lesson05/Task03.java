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
public class Task03 {

    public static void main(String[] argv) {

        //Scanner
        Scanner input = new Scanner(System.in);
        String s1, s2;

        //enter value
        System.out.print("Enter sring : ");
        s1 = input.next();
        System.out.print("Enter sring : ");
        s2 = input.next();

        /*
         *Moje bi zadachata se uslojnqva ,no taka q razbiram:
         * pri razlichna dyljina na vyvedenite stringove
         * sravnqva dokato sa ednakvi na dyljina
         * i nakraq printira ostanalite simvoli ot po-dylgiq string
         * ***komentar v komentara: moje i s metodi ,no na sledvashtoto domashno :D ***
         */
        int i;
        if (s1.compareTo(s2) == 0) {
            System.out.println("Ednakvi sa ");
        } else {
            if (s1.length() == s2.length()) {
                System.out.println("S ednakva dyljina sa");
                for (i = 0; i < s2.length(); ++i) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        System.out.print(i + " " + s1.charAt(i) + "-" + s2.charAt(i) + "\n");
                    }
                }
            } else if (s1.length() < s2.length()) {
                System.out.println("Razlichna dyljina");
                for (i = 0; i < s1.length(); ++i) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        System.out.print(i + " " + s1.charAt(i) + "-" + s2.charAt(i) + "\n");
                    }
                }
                System.out.println("Ostavashti simvoli ot 2q niz : " + s2.substring(s1.length(), s2.length()));
            }else{
                System.out.println("Razlichna dyljina");
                for (i = 0; i < s2.length(); ++i) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        System.out.print(i + " " + s1.charAt(i) + "-" + s2.charAt(i) + "\n");
                    }
                }
                System.out.println("Ostavashti simvoli ot 1q niz : " + s1.substring(s2.length(), s1.length()));
            }

        }

    }
}
