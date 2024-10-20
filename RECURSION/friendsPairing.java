package DSA.RECURSION;

import DSA.ARRAYS.diagonalSum;

public class friendsPairing {

    public static int freind(int n){

        if(n==1 || n==2){
            return n;
        }

        int single = freind(n-1);

        int Double = freind(n-2)*(n-1);

        int totalWays= single+Double;

        return totalWays;


    }

    public static void main(String[] args) {
       System.out.println( freind(3));


        
         
    }
    
}
