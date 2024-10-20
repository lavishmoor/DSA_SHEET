package DSA.ARRAYS;

import java.util.Arrays;

public class maxSubarraysii {

    // KADANCE ALGORIYHM - ARRAYS

    public static void maxSubarrays(int arr[]) {

        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
           

        }
        System.out.println("our max value subarrays sum is : "+ ms);

    }

    public static void main(String[] args) {

        int arr[] = { -2,-3,4,-1,-2,1,5,-3 };
        maxSubarrays(arr);


    }

}