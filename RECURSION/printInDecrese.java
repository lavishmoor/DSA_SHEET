package DSA.RECURSION;

import DSA.SORTING.selectionsort;

public class printInDecrese {

    public static void printInDecrese(int n){

        if(n==1){
            System.out.print(n);
            return ;
            
        }
        else{
            System.out.print(n+" ");
            printInDecrese(n-1);
           
        }

    }

    public static void main(String[] args) {
        int n=10;
        printInDecrese(n);
    
        
    }
    
}
