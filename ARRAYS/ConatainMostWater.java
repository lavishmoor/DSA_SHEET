package DSA.ARRAYS;

import JAVA.stars;

public class ConatainMostWater {

    public static int maxArea(int []height){

        int rp=height.length-1;
        int lp=0;
        int maxWater=0;

        while (lp<rp) {
            int ht=Math.min(height[rp], height[lp]);
            int width=rp-lp;
            int currentWater=ht*width;

            maxWater=Math.max(maxWater,currentWater);

            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }

            
        }
        return maxWater;
    }

    public static void main(String[] args) {
        

        int heigth[]={1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heigth));
    }
    
}
