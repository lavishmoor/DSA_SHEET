package ARRAYS;
import java.util.Arrays;

public class MEDIANofTwoArray {

    public static  void MEDIANofTwoArray(int nums1[], int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int newarray[] = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            newarray[k++] = nums1[i];

        }
        for (int j = 0; j < m; j++) {
            newarray[k++] = nums2[j];
        }
        Arrays.sort(newarray);

        int total = newarray.length;

        if (total % 2 == 1) {

            System.out.println(  (double)newarray[total / 2]);
        } else {

            int middle1 = newarray[total / 2 - 1];
            int middle2 = newarray[total / 2];

            System.out.println( ((double) middle1 +  (double)middle2) / 2.0);
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 ,4};
        MEDIANofTwoArray(nums1,nums2);
    }


  
}
