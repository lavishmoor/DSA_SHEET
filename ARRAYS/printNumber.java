package DSA.ARRAYS;

public class printNumber {

    public static void print(int arr[][],int key){
        int count =0;

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){

                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("count of 7 is : "+count);




    }
    public static void main(String[] args) {
        int arr[][]={
            {4,7,8},
            {8,8,7},
        };
        int key =7;
        print(arr, key);
    }
    
}
