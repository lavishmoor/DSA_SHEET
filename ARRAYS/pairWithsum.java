package ARRAYS;
public class pairWithsum {

    public static boolean pairWithsum(int arr[],int x){
        int n=arr.length;


        for (int i=0;i<n;i++){

            for (int j=i+1;j<n;j++){

                if (arr[i]+arr[j]==x){
                    return true;
                  
                    
                }
            }
        }
        return false;
       
    }
    public static void main(String[] args) {
        int arr[]={11,1,20};
        int x=21;
     System.out.println(pairWithsum(arr, x));
    }
    
}
