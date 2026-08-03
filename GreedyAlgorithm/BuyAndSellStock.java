package GreedyAlgorithm;

public class BuyAndSellStock {
    public static void main(String[]args){
        int[] prices = {7,6,8,3,1};

        int buyStock = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length; i++){
            if(buyStock>prices[i]){
                buyStock = prices[i];
            }else if(prices[i]-buyStock>profit){
                profit = prices[i]-buyStock;
            }

        }
        System.out.println(profit);
    }
}
