
import sun.applet.Main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cvety
 */
public class Task01 {

    public static void main(String[] argc) {
        //arr
        int[][] arr = {{48, 72, 13, 14, 15},
            {21, 22, 53, 24, 75},
            {31, 57, 33, 34, 35},
            {41, 95, 43, 44, 45},
            {59, 52, 53, 54, 55},
            {61, 69, 63, 64, 65}};

        //min, max
        int min = arr[0][0];
        int indexMinI = 0;
        int indexMinJ = 0;
        int max = 0;
        int indexMaxI = 0;
        int indexMaxJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    indexMinI = i;
                    indexMinJ = j;
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexMaxI = i;
                    indexMaxJ = j;

                }
            }
        }

        //print
        System.out.printf("Maksimalnata stoinost e %d i se namira na red %d i kolona %d \n",
                arr[indexMaxI][indexMaxJ], indexMaxI + 1, indexMaxJ + 1);
        System.out.printf("Minimalnata stoinost e %d i se namira na red %d i kolona %d \n",
                arr[indexMinI][indexMinJ], indexMinI + 1, indexMinJ + 1);
    }
}
