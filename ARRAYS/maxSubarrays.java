package ARRAYS;
public class maxSubarrays {

    public static void maxSubarrays(int nums[]) {
        int n = nums.length;

        int maxSum = Integer.MIN_VALUE;
        int current =0;

        for (int i=0;i<n;i++){
            current=current+nums[i];

            if (current<0){
                current=0;
            }

             maxSum=Math.max(current, maxSum);


        }
        System.out.println(maxSum);

    }

    public static void main(String[] args) {

        int nums[] = { 2,7,6,1,4,5 };
        maxSubarrays(nums);
    }

}
