package DSA.ARRAYS;

import java.util.Arrays;

public class Swap2D {
    public static void main(String[] args) {
        int arr[][] = {
                { 11, 12, 13 },
                { 21, 22, 23 },
        };

        int row = 2, col = 3;
        int transpose[][] = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }

        }

        System.out.println(Arrays.deepToString(transpose));
    }

}
