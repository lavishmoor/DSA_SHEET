package ARRAYS;
public class subarrayDividedByK {
    public static void subarrayDividedByK(int arr[],int k)
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        int currentSum=0;

        for(int i=0;i<n;i++){

            currentSum +=arr[i];
            if(currentSum<0){
                currentSum=0;
            }

             if(currentSum%k==0){
                max=Math.max(currentSum,max);
             }


        }

        System.out.println(max);
    }


    public static void main(String[] args) {
        int arr[]={2,7,6,1,4,5};
    int k=3;
    subarrayDividedByK(arr, k);
        
    }
    
    
}
