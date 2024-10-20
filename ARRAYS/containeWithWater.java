package ARRAYS;
public class containeWithWater {

    public static int containeWithWater(int height[]) {
        int n = height.length;

        int leftArrays[] = new int[n];
        leftArrays[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftArrays[i] = Math.max(leftArrays[i - 1], height[i]);
        }
    

        int rightArrays[] = new int[n];
        rightArrays[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightArrays[i] = Math.max(rightArrays[i + 1], height[i]);
        }

        int trappedWater = 1;

        for (int i = 0; i < n; i++) {
            int Waterlevel = Math.min(rightArrays[i], leftArrays[i]);

            trappedWater = rightArrays[i]*leftArrays[i] ;
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(containeWithWater(height));
    }

}
