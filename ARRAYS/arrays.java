package DSA.ARRAYS;


import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static int find(int number[], int key) {

        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int number[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("------------------");

        System.out.println(Arrays.toString(number));

        System.out.println("enter key value");
        int key = sc.nextInt();

        int result = find(number, key);
    
        if(result==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("KEY FOUNDED AT INDEX :"+ result);
        }

    }
}
