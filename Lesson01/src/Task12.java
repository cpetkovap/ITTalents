
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task12 {

    public static void main(String argc[]) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Input variables
        System.out.print("Enter int day : ");
        int day = input.nextInt();
        System.out.print("Enter int month : ");
        int month = input.nextInt();
        System.out.print("Enter int year : ");
        int year = input.nextInt();
        //if(year)
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if (day > 0 && day < 31) {
                System.out.printf("Date : %02d.%02d.%d godina \n", day + 1, month, year);
            } else if (day == 31) {
                System.out.printf("Date : %02d.%02d.%d godina \n", 1, month + 1, year);
            } else {
                System.out.println("Nevaliden den");
            }
        } else if (month == 2) {
            if (((year % 4 == 0) && (year / 100 > 10)) || (year % 400 == 0)) {
                if (day > 0 && day < 29) {
                    System.out.printf("Date : %02d.%02d.%d godina \n", day + 1, month, year);
                } else if (day == 29) {
                    System.out.printf("Date : %02d.%02d.%d godina \n", 1, month + 1, year);
                } else {
                    System.out.println("Nevaliden den");
                }
            } else {
                if (day > 0 && day < 28) {
                    System.out.printf("Date : %02d.%02d.%d godina \n", day + 1, month, year);
                } else if (day == 28) {
                    System.out.printf("Date : %02d.%02d.%d godina \n", 1, month + 1, year);
                } else {
                    System.out.println("Nevaliden den");
                }
            }
        } else if (month == 12) {
            if (day > 0 && day < 31) {
                System.out.printf("Date : %02d.%02d.%d godina \n", day + 1, month, year);
            } else if (day == 31) {
                System.out.printf("Date : %02d.%02d.%dgodina \n", 1, 1, year + 1);
            } else {
                System.out.println("Nevaliden den");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 0 && day < 30) {
                System.out.printf("Date : %02d.%02d.%d godina \n", day + 1, month, year);
            } else if (day == 30) {
                System.out.printf("Date : %02d.%02d.%d godina \n", 1, month + 1, year);
            } else {
                System.out.println("Nevaliden den");
            }
        } else {
            System.out.println("takyv mesec nqma ");
        }


    }
}
