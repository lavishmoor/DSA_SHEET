package ARRAYS;
import java.util.Arrays;

public class productExceptSelf {

    public static int[] productExceptSelf(int nums[]) {

        int n=nums.length;
        int product=1;
        int newArrays[]=new int [n];

        for(int i=0;i<n;i++){
            product=1;

            for (int j=0;j<n;j++){

                if (i==j)continue;

                product *=nums[j];


            }
            newArrays[i]=product;
            
        }
        return newArrays;

        
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}
