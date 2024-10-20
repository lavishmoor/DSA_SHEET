package ARRAYS;

public class RepeatAndMissing {

    public static void RepeatAndMissing(int arr[]) {
        int n = arr.length;

        // repeat
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(i + " and " + j + "are having same value : " + arr[i]);

                }

            }
        }

        // total sum
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total = total + i;

        }
        
        int currentsum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if(arr[i]==arr[j]){
                    arr[i]=0;
                }
               
            }
            currentsum = currentsum + arr[i];
        }

        int result = total - currentsum;
        System.out.println("missing value is " + result);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 3,4,7 };
        RepeatAndMissing(arr);
    }

}
