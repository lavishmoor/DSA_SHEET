package DSA.RECURSION;

public class sumofN {

    public static int sumofN(int n){
        if(n==1){
            return 1;
        }
        int sum = n+sumofN(n-1);
        return sum;
    }

    public static void main(String[] args) {
        
        int n=5;
        System.out.println(sumofN(n));
    }
    
} 
