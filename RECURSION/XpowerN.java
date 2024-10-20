package DSA.RECURSION;

public class XpowerN {
    public static int  XpowerN(int x ,int n){

        if(n==0){

            return 1;

        }
         
        return  x*XpowerN(x, n-1);

    }
    public static void main(String[] args) {


        System.out.println(XpowerN(2, 5));
        
    }
    
}
  