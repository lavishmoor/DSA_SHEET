package ARRAYS;
public class minimumINarrays {
    public static int minimumINarrays(int arr[]){

        int n=arr.length;
        int min=Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(minimumINarrays(arr));
    }
    
}
