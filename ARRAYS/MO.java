package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class MO {

    public static void print( int arr[],int query[][]){

        int n= arr.length;

        int firstsum=0;

        for (int i=query[0][0]; i<query[0][4];i++){

            firstsum = firstsum+arr[i];
        }
        System.out.println(firstsum);
        
    }
    public static void main(String[] args) {


        int arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
       int  query[][] = {{0, 4}, {1, 3}, {2, 4}};

       print(arr, query);
        
    }
}
