package DSA.ARRAYS;

import java.util.Arrays;

public class new_dub {

    public static void main(String[] args) {

        int arr[]={10,87,6,75,3,55,3,55};
        int k=1;
        int newArr[]= new int[10];

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
        
            if(arr[i]==arr[i+1]){
               newArr[i]=arr[i];
               k++;
                
            }
        }
    

        arr.toString();

    }

}
