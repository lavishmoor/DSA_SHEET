package ARRAYS;
import java.util.Arrays;

public class chocholate {

    public static int chocholateProblem(int arr[], int key){
        int n = arr.length;

        Arrays.sort(arr);
        System.out.println("sorted array is : " + Arrays.toString(arr));
        int min = Integer.MAX_VALUE;

        for (int i = 0; i + key - 1 < n; i++) {

            int diff = arr[i + key - 1] - arr[i];
            
            if (diff < min) {
                min = diff;
            }
            

        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int key = 3;

     System.out.println("minimum difference is : "+ chocholateProblem(arr, key));
    }

}
