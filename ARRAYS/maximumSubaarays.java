package ARRAYS;
public class maximumSubaarays {
    public static void maximumSubaarays(int nums[]){
        int n= nums.length;

        int product = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                 product = 1;
                for (int k = i; k <= j; k++) {

                    product=product*nums[k];

                }
                System.out.println("current sum is : "+ product);
                if (max<product){
                    max=product;
                }
            }
        }
        System.out.println("max product = "+max);
      

    }

    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
    maximumSubaarays(nums);


    }
    
}
