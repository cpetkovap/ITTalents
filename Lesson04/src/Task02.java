
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task02 {

    public static void main(String[] argc) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //input length
        int len;
        do {
            System.out.print("Input length : ");
            len = input.nextInt();
        } while (len < 1);

        //input arr
        /*
         * Osven che chislata, koito se vyvejdat za elementi na masiva sa estestveni , te sa i nechetni
         * Izvinqvam se za promqnata na usloviqta,
         * no chesto smesvam usloviqta na nqkolko zadachi.
         * Ne mi se promenq, zashtoto taka zadachkata stana oshte po-qka :)))
         */
        int[][] arr = new int[len][len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                do {
                    System.out.printf("Arr[%d][%d] = ", i + 1, j + 1);
                    arr[i][j] = input.nextInt();
                } while (arr[i][j] % 2 == 0 || arr[i][j] < 1);
            }
        }

        System.out.println();

        //print matrix
        System.out.println("Result : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //first diagonal
        System.out.println();
        System.out.print("First diagonal : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println();

        //second diagonal
        System.out.print("Second diagonal : ");
        int k = arr[0].length - 1;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i][k] + " ");
            k--;

        }

        System.out.println();

    }
}
