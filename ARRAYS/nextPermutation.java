package DSA.ARRAYS;

import java.util.Arrays;

public class nextPermutation {

    public static void permutation(int arr[], int ans[]) {

        if (arr.length == 0) {

            System.out.println(ans);

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            if (curr == arr[i]) {
                continue;
            } else {
                ans[i] = arr[i];
            }

            permutation(arr, ans);
        }
    }

    
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        int ans[] = new int[arr.length];

        permutation(arr, ans);

    }
}