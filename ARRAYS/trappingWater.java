package ARRAYS;
public class trappingWater {

    public static void trappingWater(int height[]) {

        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for (int i = 1; i < n; i++) {

            leftmax[i] = Math.max(height[i], leftmax[i - 1]);

        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {

            int waterlevel = Math.min(rightmax[i], leftmax[i]);

            trappedWater += waterlevel - height[i];

        }

        System.out.println(trappedWater);
    }

    public static void main(String[] args) {
        int height[] = { 1,8,6,2,5,4,8,3,7};
        trappingWater(height);
    }

}
