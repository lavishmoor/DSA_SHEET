package ARRAYS;
public class printAllCombination {

    public static void printAllCombination(int arr[], int r) {

        int n = arr.length;
        for (int i = 0; i < n ; i++) {

            for (int j=i+1;j<n;j++){
                System.out.println(arr[i] + "," + arr[j]);
            }

    
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int r = 2;
        printAllCombination(arr, r);
    }
}
