package DSA.STACK;

import java.util.Stack;

public class framework {

    
    public static void main(String[] args) {

       Stack<Integer> s= new Stack<>();

        s.push(10);
        s.push(20);
        s.push(33);

       
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

    
}
