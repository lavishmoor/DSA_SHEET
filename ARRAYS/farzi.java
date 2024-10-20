package ARRAYS;

import java.util.Arrays;

public class farzi {

  public static int[] farzi(int arr[], int target) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          return new int[] { i+1, j+1 };
        }
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {

    int arr[] = { 2,3,4 };
    int target = 6;
   System.out.println(Arrays.toString(farzi(arr, target)));

  }

}
