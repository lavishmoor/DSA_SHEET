package DSA.ARRAYS;

public class digitTodigit {

    private static String digitToWord(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                throw new IllegalArgumentException("Invalid digit: " + digit);
        }
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        String numberStr = Integer.toString(number);
        StringBuilder words = new StringBuilder();

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            words.append(digitToWord(digit)).append(" ");
        }

        return words.toString().trim(); // Trim to remove trailing space
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("The number " + number + " in words is: " + numberToWords(number));

    }

}
