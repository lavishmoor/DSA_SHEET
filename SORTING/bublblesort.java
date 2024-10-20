package DSA.SORTING;

import java.util.Arrays;

public class bublblesort {
    public static void bublblesort(int arr[]){

        int n = arr.length;

        int min=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bublblesort(arr);
        
    }
    
}
