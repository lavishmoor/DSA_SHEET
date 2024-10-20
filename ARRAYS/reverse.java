package DSA.ARRAYS;

import java.util.Arrays;

public class reverse {

    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start <end){

            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {
        
        int arr[]={2,4,6,4,1};

        reverse(arr);


    }
    
}
