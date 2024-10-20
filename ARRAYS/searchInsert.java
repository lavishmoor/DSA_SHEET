package ARRAYS;
public class searchInsert {

    public static int searchInsert(int[] nums, int target) {
        int n =nums.length;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
               return i;
                }

                
               
               
               
            }
             if (target<n){
                return 1;
            }
            else if (target>n){
                return n;
            }
            else{
                return -1;

            }
        
        }
      
       
       
        

    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
    
}
