package ARRAYS;
public class search {

    public static int search(int nums[],int target){
        int n =nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]==target){
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
         
        int nums[]={4,5,6,7,0,1,2};
        int target =3;

        System.out.println(search(nums, target));
    }
    
}
