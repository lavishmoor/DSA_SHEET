package ARRAYS;

public class equilibrium {

    public static int  Findequilibrium(int arr[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

        }

        int runningSum=0;

        for(int i=0;i<n;i++){
            int rightSum=sum-runningSum-arr[i];
            if(rightSum==runningSum){
                return i;
            }
            runningSum =+arr[i];


        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 1, 6 };
        int n = arr.length;
        System.out.println(n);
        Findequilibrium(arr, n);
    }

}
