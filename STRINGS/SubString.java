package DSA.STRINGS;

public class SubString {
    public static String SubString(String str, int Si, int Ei) {

        String Substr = "";
        for (int i = Si; i < Ei; i++) {
            Substr += str.charAt(i);

        }
        return Substr;
    }

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(0,5));

        System.out.println(SubString(str, 0, 5));

    }

}
