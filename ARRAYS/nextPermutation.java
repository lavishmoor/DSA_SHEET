package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class nextPermutation {

    public static void nextPermutation(int nums[]) {
        int idx = -1;
        int n = nums.length-1;

        for (int i = n; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            Collections.reverse(Arrays.asList(nums));
        } else {
            int pre = idx;

            for (int i = idx + 1; i <= n; i++) {
                if (nums[i] > nums[idx - 1] && nums[i] <= nums[pre]) {
                    pre = i;
                }
            }

            int temp;
            temp = nums[idx - 1];
            nums[idx - 1] = nums[pre];

            nums[pre] = temp;

            int start = idx;
            int end = n;
            while (start <= end) {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.asList(nums));
            System.out.println(Arrays.toString(nums));
            
           
        }

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);

    }

}