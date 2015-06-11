
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task14 {

    public static void main(String argc[]) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int variable a.x : ");
        int a = input.nextInt();
        System.out.print("Enter int variable a.y : ");
        int b = input.nextInt();
        System.out.print("Enter int variable b.x : ");
        int c = input.nextInt();
        System.out.print("Enter int variable b.y : ");
        int d = input.nextInt();
        char v1 = 0, v2 = 0;

        if (a <= 0 || a > 8 || b <= 0 || b > 8 || c <= 0 || c > 8 || d <= 0 || d > 8) {
            System.out.print("Error");
        } else {
            if (a % 2 == 1 && b % 2 == 1) {
                v1 = 'c';
            } else if (a % 2 == 0 && b % 2 == 0) {
                v1 = 'c';
            } else if (a % 2 == 1 && b % 2 == 0) {
                v1 = 'w';
            } else if (a % 2 == 0 && b % 2 == 1) {
                v1 = 'w';
            }


            if (c % 2 == 1 && d % 2 == 1) {
                v2 = 'c';
            } else if (c % 2 == 0 && d % 2 == 0) {
                v2 = 'c';
            } else if (c % 2 == 1 && d % 2 == 0) {
                v2 = 'w';
            } else if (c % 2 == 0 && d % 2 == 1) {
                v2 = 'w';
            }

            //System.out.println(v1);
            //System.out.println(v2);
            if (v1 == v2) {
                System.out.print("poziciite sa s ednakyv cvqt");
            } else {
                System.out.print("poziciite sa s razlichen cvqt");
            }

        }
    }
}
