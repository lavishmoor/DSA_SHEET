package DSA.RECURSION;

public class factorial {
    public static int factorial(int n) {

        
        if (n == 0) {
            return 1;

        }

        // int fm1 = factorial(n-1);
        int f=n* factorial(n-1);
        return f;

    }


    public static void main(String[] args) {

        int n = 2;
        System.out.println(factorial(n));
    }

}
