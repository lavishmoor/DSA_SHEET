package DSA.ARRAYS;

public class largest {

    public static int largestNumber(int number[]) {
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (min < number[i]) {
                min = number[i];

            }
        }
        return min;

    }

    public static void main(String[] args) {

        int number[] = { 20, 80, 60, 44, 50, 90, 40, 20 };

        int result = largestNumber(number);
        System.out.println("the largest value is : "+ result);

    }
}