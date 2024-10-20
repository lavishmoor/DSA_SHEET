package DSA.RECURSION;

import JAVA.stars;

public class numberTOdigit {

    public static String print(String digits[], int dig[]) {


        String output="";


       

        for(int i=0;i<dig.length;i++){

            int postion = dig[i];
            output = output + digits[postion];

        }
        return output.toString();
        

    }

    public static void main(String[] args) {

        String digits[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine" };

        int dig[] = { 1, 9, 4, 5 };
        print(digits, dig);

    }

}
