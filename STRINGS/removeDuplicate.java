package DSA.STRINGS;

import java.util.Arrays;

public class removeDuplicate {

    public static String removeDuplicate(String str) {

        // char [] schar= str.toCharArray();

        String result = "";

        // Arrays.sort(schar);

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            }
            else{

            result = result + str.charAt(i);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String str = "apnacollege";
       System.out.println(removeDuplicate(str));

    }

}
