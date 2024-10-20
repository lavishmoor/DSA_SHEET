package DSA.ARRAYS;

import java.util.Arrays;

public class maxSubarrays {
    public static void maxSubarrays(int arr[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                 current = 0;
                for (int k = i; k <= j; k++) {

                    current=current+arr[k];

                }
               
                if (max<current){
                    max=current;
                }
            }
        }
        System.out.println("max sum = "+max);

    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println(Arrays.toString(arr));

         maxSubarrays(arr);

    }

}
