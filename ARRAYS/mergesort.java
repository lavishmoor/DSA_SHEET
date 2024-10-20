package ARRAYS;
import java.util.Arrays;

public class mergesort {

    public static void mergesort(int []nums1,int m,int[] nums2,int n){

        int arr[]=new int[m+n];

        int k=0;

        for (int i=0;i<m;i++){
            arr[k++]=nums1[i];

        }
        for (int i=0;i<n;i++){
            arr[k++]=nums2[i];

        }

       

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

       

    }

    public static void main(String[] args) {
        

        int nums1[]={0};
        int m=0;

        int nums2[]={1};
        int n=1;

        mergesort(nums1, m, nums2, n);
    }
    
}
