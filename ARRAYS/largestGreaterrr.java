package DSA.ARRAYS;

public class largestGreaterrr {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };

        int newArra[] = new int[arr.length];
        int n = arr.length;

        int k = 0;
        for (int i = 0; i < n; i++) {
            newArra[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] < arr[j]) {
                    newArra[k++] = arr[j];
                  break;
                }

            }
        }

        for  (int i = 0; i < newArra.length; i++) {
            System.out.print(newArra[i] + " ");
        }

    }

}
