package DSA.STACK;
import java.util.*;

public class smallestGreater {
    public static void main(String[] args) {
        

        int arr[]={6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int nextSmallest[]= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
                
            }
            if(s.isEmpty()){
                nextSmallest[i]=-1;
            }else{
                nextSmallest[i]=arr[s.peek()];
            }

            s.push(i);
        }


        for(int i=0;i<nextSmallest.length;i++){
            System.out.print(nextSmallest[i]+" ");
        
        }
    }
    
}
