package ARRAYS;
public class fisrtAndlast {

    public static void  fisrtAndlast(int nums[],int target){
        int n = nums.length;
        

        for (int i=0;i<n;i++){
            for (int j=n-1;j>=0;j--){

                if (nums[i]==target && nums[j]==target){
 
                   System.out.println("[ "+i+","+j +"]");
                   break;
                }
            }

        }
        
    }
    public static void main(String[] args) {
        
        int nums[]={5,7,7,8,8,10};
        int target=8;
        fisrtAndlast(nums,target);
    }
    
}
