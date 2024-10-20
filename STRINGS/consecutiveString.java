package STRINGS;

public class consecutiveString {

    public static String consecutiveString(String str) {

        String answer = "";

        // char[] schar = str.toCharArray();

        int n = str.length();

        for (int i = 0; i < n; i++) {

            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                continue;
            } else {
                answer = answer + str.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {

        String str = "aabb";
        System.out.println(consecutiveString(str));

    }

}
