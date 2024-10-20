package ARRAYS;
public class minmax{

    public static void minmax(int arr[]){

        int minimum =Integer.MAX_VALUE;

        int maximum =Integer.MIN_VALUE;


        for (int i=0;i<arr.length;i++){
            if (arr[i]<minimum){

                minimum=arr[i];
            }
        }
        System.out.println("minimum value is : "+minimum);



        
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maximum){

                maximum=arr[i];
            }
        }
        System.out.println("maximum  value is : "+maximum);

    }


    public static void main(String[] args) {
        int arr []= {3,5,4,1,9};

        minmax(arr);


    }
}