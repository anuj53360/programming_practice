package programmingpractice.src.practice2023.dp;

import java.util.Arrays;

public class CoinChangeLeetCode {

    public int coinChange(int[] coins, int amount) {
     int index = coins.length;
     //int minCoin =  coinChangeRecurssion(coins , amount , index);
        int [][]dp = new int [index][amount+1];
        for (int []row : dp){
            Arrays.fill(row , -1);
        }
        int minCoin =  coinChangeMemoization(coins , amount , index-1 ,dp);
        if (minCoin >= (int)Math.pow(10,9)){
            return -1;
        }
        return  minCoin;
    }

    public int coinChangeDP(int[] coins, int amount) {
        int n = coins.length;
        int [][]dp = new int[n][amount+1];

        for (int i=0;i<=amount;i++){
                if (i % coins[0] == 0){
                    dp[0][i] = i/coins[0];
                }else
                    dp[0][i] =  (int)Math.pow(10,9);
            }

   for (int index =1;index<n;index++){
       for (int j=0;j<=amount;j++){

           int notPick = 0 + dp[index-1][j];
           int pick =(int)Math.pow(10,9);
           if (coins[index] <= j){
               pick = 1 + dp[index][j - coins[index]];
           }
           dp[index][j] = Math.min(notPick , pick);
       }
   }
int minCoin = dp[n-1][amount];
        if (minCoin >= (int)Math.pow(10,9)){
            return -1;
        }
        return  minCoin;
    }


    private int coinChangeMemoization(int[] coins, int amount, int index, int[][] dp) {
        if (index == 0){
            if (amount % coins[0] == 0){
                return amount/coins[0];
            }else
                return  (int)Math.pow(10,9);
        }
        if (dp[index][amount] != -1){
            return dp[index][amount];
        }

        int notPick = 0 + coinChangeMemoization(coins, amount, index-1 ,dp);
        int pick =(int)Math.pow(10,9);
        if (coins[index] <= amount){
            pick = 1 + coinChangeMemoization(coins, amount - coins[index], index,dp);
        }

        return dp[index][amount] = Math.min(notPick , pick);

    }

//    private int coinChangeRecurssion(int[] coins, int amount, int index) {
//
//        if (index == 0){
//            if (amount % coins[0] == 0){
//                return amount/coins[0];
//            }else
//                return  Integer.MAX_VALUE;
//        }
//
//        int notPick = 0 + coinChangeRecurssion(coins, amount, index-1);
//        int pick = Integer.MAX_VALUE;
//        if (coins[index] <= amount){
//            pick = coins[index] + coinChangeRecurssion(coins, amount - coins[index], index);
//        }
//
//        return Math.min(notPick , pick);
//    }



    public static void main(String[] args) {
       int []coins = {1,2,5};
       int amount = 11;
       CoinChangeLeetCode coinChange = new CoinChangeLeetCode();
     System.out.println(coinChange.coinChange(coins , amount));
    }
}
