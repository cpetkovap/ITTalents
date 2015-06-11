/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cvety
 */
public class Task05 {

    public static void main(String[] argc) {

        //arr
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int maxRow = 0;
        int rowSum = 0;
        int maxCol = arr[0][0];
        int colSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxRow) {
                maxRow = rowSum;
            }
            rowSum = 0;
        }


        for (int j = 0; j < arr[0].length; j++) {
            for(int i = 0; i < arr.length; i++){
                colSum += arr[i][j];
            }

            if (colSum > maxCol) {
                maxCol = colSum;
            }
            colSum = 0;


        }

        System.out.println("Максималната сума по редове е " + maxRow);
        System.out.println("Максималната сума по колони е " + maxCol);

        if(maxRow > maxCol){
            System.out.println("Максималната сума по редове е > от максималната сума по колони");
        }else if(maxRow < maxCol){
            System.out.println("Максималната сума по редове е < от максималната сума по колони");
        }else{
            System.out.println("Максималната сума по редове е = от максималната сума по колони");

        }

    }
}
