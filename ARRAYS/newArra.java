package DSA.ARRAYS;

public class newArra {
    public static void main(String[] args) {

        int arr[] = {1,2,10,20,30,40,50};
        int k = 2;

        int count = 0;
        int newArr[] = new int[arr.length];
        for (int i =arr.length-k; i<arr.length; i++) {

            newArr[count++] = arr[i];

        }
        for (int j = 0; j < arr.length - k; j++) {
            newArr[count++] = arr[j];
        }

        for (int m = 0; m < newArr.length; m++) {
            System.out.print(newArr[m] + " ");
            
        }
        

    }

}
