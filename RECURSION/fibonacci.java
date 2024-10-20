package RECURSION;

public class fibonacci {
    public  static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn= fibonacci(n-1)+fibonacci(n-2);
        return fn;

    }

    public static void printfib(int i,int a,int b){
        if(i==5){
            return ;
        }
        System.out.print(a+" ");
        System.out.print(b+" ");
        int sum=a+b;
        printfib(i+1, sum, sum);

        
        System.out.println(sum+" ");
        
    }
    public static void main(String[] args) {
          
        
         printfib(0, 0, 1);
    }
    
}
