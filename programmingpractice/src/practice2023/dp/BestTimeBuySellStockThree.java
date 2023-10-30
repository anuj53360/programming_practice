package programmingpractice.src.practice2023.dp;

import java.util.Arrays;
import java.util.Map;

public class BestTimeBuySellStockThree {


    public int maxProfit(int[] prices) {

        int [][][]dp = new int[prices.length+1][2][3];
        int n = prices.length;

        for (int i = n-1 ;i>=0 ;i++){
            for(int buy =0;buy<=1;buy++){
             for (int cap=0; cap<=2 ;cap++){

                 if (buy ==0){
                     dp[i][buy][cap] = Math.max(0+dp[i+1][0][cap] , -prices[i]+dp[i+1][1][cap]);
                 }

                 if (buy ==1){
                     dp[i][buy][cap] = Math.max(0+dp[i+1][1][cap] , prices[i]+dp[i+1][0][cap-1]);
                 }
             }
            }
        }

return  dp[0][0][2];
    }

    public static void main(String[] args) {

       int []prices = {3,3,5,0,0,3,1,4};
       BestTimeBuySellStockThree bt = new BestTimeBuySellStockThree();
       bt.maxProfit(prices);
    }
}
