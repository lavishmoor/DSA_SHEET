package DSA.SORTING;

import java.util.Arrays;

public class selectionnSort {
    public static void selectionnSort(int arr[]){

        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min] >arr[j]){
                    min =j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};
        selectionnSort(arr);
        
    }
    
}
