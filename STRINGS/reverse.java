package STRINGS;

import java.util.Arrays;

public class reverse {

    public static void revsere(String str1 ) {



        int n = str1.length();

        for (int i=0;i<str1.length();i++){
            for(int j=i; j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str1.charAt(i)+" ");
                }
                System.out.println();
            }
        }
       

    }

   

    
    public static void main(String[] args) {

        String str1 = "123";
        
        revsere(str1);

    }

}
