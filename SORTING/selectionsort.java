package DSA.SORTING;

import java.util.Arrays;

public class selectionsort {

    public static void selectionsort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        selectionsort(arr);

    }
}