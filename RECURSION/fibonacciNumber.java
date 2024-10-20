package DSA.RECURSION;

public class fibonacciNumber {

    public static int fibonacciNumber(int n){

        if(n==0 || n==1){
            return n;
        }

        int f1=fibonacciNumber(n-1);
        int f2=fibonacciNumber(n-2);
        int fn=f1+f2;

        return fn;


    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacciNumber(n));

        
    }
    
}
