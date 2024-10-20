package DSA.STACK;

import java.util.*;

public class validParanthesis {

    public static boolean validParanthesis(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);

            } else {

                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str = "({})[]";
        System.out.println(validParanthesis(str));

    }
}





class Solution {
    public boolean isValid(String s) {
        

        
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {

            if (c == '(') 
                stack.push(')');
            

            else if (c == '[') 
                stack.push(']');

            
                else if (c == '{') 
                stack.push('}');
            

            else if(stack.isEmpty() || stack.pop() !=c)
                return false;
            
        }
        return stack.isEmpty();
    }
}