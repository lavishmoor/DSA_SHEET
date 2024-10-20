package ARRAYS;

import java.util.Arrays;

public class KthSmallest {
    public static void KthSmallest(int arr[], int k) {
        int n = arr.length;
        

        Arrays.sort(arr);

        System.out.println(k+"th smallest value in the given array is "+arr[k-1]);

    }
        

    public static void main(String[] args) {
//3 4 7 10 15 20
        int arr[] = { 7, 10, 4,3, 20, 15 };
        int k = 3;

        KthSmallest(arr, k);

    }
}
