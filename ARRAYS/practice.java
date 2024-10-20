package DSA.ARRAYS;

public class practice {

    public static boolean twiceNumber(int arr[]){

        int n= arr.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){

                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static int waterProblem(int height[]){

        int n= height.length;


        int left[]=new int[n];
        left[0]=height[0];

        for (int i=1;i<n;i++){

            left[i]=Math.max(height[i], left[i-1]);
        }

        int right[]=new int[n];
        right[n-1]=height[n-1];

        for (int i =n-2;i>=0;i--){
            right[i]=Math.max(height[i], right[i+1]);
        }



        int trappedwater =0;

        for (int i=0;i<n;i++){

            int waterlevel = Math.min(left[i], right[i]);


            trappedwater=trappedwater+waterlevel-height[i];

            
        }
        return trappedwater;




    }






    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,4,3,2,4,2};
       


        int height[]={4,2,0,3,2,5};
       int heigh2[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(waterProblem(height));
        System.out.println(waterProblem(heigh2));
        
    }
    
}
