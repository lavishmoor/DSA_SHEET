package ARRAYS;
import java.util.Arrays;

public class reverse {

    public static void reverseArray(int arr[]) {

        int n = arr.length;

        int first = 0;
        int last = n - 1;

        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        // for printing new array

        System.out.print("after reverse : " + Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 1, 2 };
        System.out.println("before reverse :" + (Arrays.toString(arr)));

        reverseArray(arr);

    }

}
