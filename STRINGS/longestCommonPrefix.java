package STRINGS;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * longestC ommonPrefix
 */
public class longestCommonPrefix {

    public static String longest(String[] str) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(str);

        char[] first = str[0].toCharArray();

        char[] last = str[str.length - 1].toCharArray();
        

        for (int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();

    }

    public static void main(String[] args) {

        String[] strs = { "flower", "flow", "flight" };
       System.out.println(longest(strs));

    }

}