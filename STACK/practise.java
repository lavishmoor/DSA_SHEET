package DSA.STACK;
 
import java.net.Inet4Address;
import java.util.Stack;

public class practise {

    public static void pushAtbottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        } 
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);

    }

    public static String revrseString(String str) {

        Stack<Character> s = new Stack<>();

        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);

        }
        return result.toString();

    }

    public static void reverseStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);

    }

    public static void revrse2(Stack<Integer> s, int n) {

        Stack<Integer> ans = new Stack<>();
        while (!s.empty()) {
            ans.push(s.pop());
            
        }
        // printStack(ans);

    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }
      
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


       reverseStack(s);
        printStack(s);


       
        
    }

}
   