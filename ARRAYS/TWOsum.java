package ARRAYS;
import java.util.Arrays;

public class TWOsum {

    public static int[] TWOsum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
  
    }

    public static void main(String[] args) {

        int arr[] = {3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(TWOsum(arr, target)));

    }

}
