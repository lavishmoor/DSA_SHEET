package DSA.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

import JAVA.stars;

public class TwoDarray {
    public static boolean search(int arr[][], int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == key) {

                    System.out.println("key founded at the cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;

    }

    public static void main(String[] args) {

        int arr[][] = new int[3][3];
        int k = 60;

        int n = arr.length;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

//print output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(search(arr, k));

    }
}