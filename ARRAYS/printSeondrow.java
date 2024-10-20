package DSA.ARRAYS;

public class printSeondrow {
 public static void printSeondrow(int arr[][]){
    int sum=0;
    for (int i=1;i<arr.length;i++){
        for(int j=0;j<arr[1].length;j++){
            sum =sum +arr[i][j];


        }
        break;
    }
    System.out.println(sum);
 }

    public static void main(String[] args) {
        int arr[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3},
        };

        printSeondrow(arr);


    }
    
}
