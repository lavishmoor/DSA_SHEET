package DSA.ARRAYS;

import java.util.Arrays;

public class binarysearch {



    public static int binarysearch(int number[],int key){
        int start =0;
        int end=number.length-1;

        while (start<=end) {

            //middle
            int mid =(start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr []= {10,20,30,40,50,60,70};
         int key=60;

         int result=binarysearch(arr, key);
         System.out.println("key founded at index : "+result);

    }
    
}
