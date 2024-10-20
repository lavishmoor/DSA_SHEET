package ARRAYS;

import java.util.Arrays;

public class KthLargest {

    public static int KthLargest(int nums[], int k) {

        int n = nums.length;

        Arrays.sort(nums);
        return nums[n - k];
      
    }

    public static void main(String[] args) {

        // 1 2 3 4 5 6
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println("largest kth element is :"+KthLargest(nums, k));
    }

}
