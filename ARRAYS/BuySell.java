package DSA.ARRAYS;

public class BuySell {


    public static int buyAndSell(int sellingPrices[]){

        int buyPrice= Integer.MAX_VALUE;

        int maxProfit=0;

        for (int i=0;i<sellingPrices.length;i++){
            if(buyPrice <sellingPrices[i]){
                int profit = sellingPrices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice=sellingPrices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {

        int sellingPrices []= {7,1,5,3,6,4};
System.out.println(buyAndSell(sellingPrices));

        
    }
    
}
