package DSA.ARRAYS;

import java.util.Arrays;

import DSA.RECURSION.sort;
import JAVA.stars;

public class removeDuplicate {

    public static void removeDuplicate(int arr[]) {
        int n = arr.length;

        Arrays.sort(arr);

        int newArray [] =new int[n];
        int k = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                newArray[k++] = arr[i];

                
            }

        }

        for (int i=0;i<newArray.length-1;i++){

            if(newArray[i]==0){
                continue;
            }
            System.out.print(newArray[i]+" ");
        }
       
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 8, 6, 7, 55, 77, 4, 4, 4,0 };
         
   removeDuplicate(null);


    }

}
