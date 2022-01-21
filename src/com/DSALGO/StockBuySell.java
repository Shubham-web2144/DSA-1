package com.DSALGO;

public class StockBuySell {
//    Problem buy a stock in low price and sell at highest price and calculate profit
    public static void main(String args[]){
        int arr[] = {4,8,3,9,22,1,2};
        int minRate = arr[0];
        int maxRate = arr[0];
        int minDay = 0;
        int maxDay = 0;
        int finalProfite = 0;
        int profite = 0;

        for(int i = 1; i < arr.length; i++){
//            minimum value
            if(arr[i] < minRate){
                minRate = arr[i];
                minDay = i;
                profite = minRate - maxRate;

            }

//            max value
            if(arr[i] > maxRate){
                maxRate = arr[i];
                maxDay = i;
                profite = minRate - maxRate;

            }
        }

        System.out.println("Buy stock on : " + minDay);
        System.out.println("Sell stock at :" + maxDay);
        System.out.println("Profite is " + Math.abs(profite));
    }
}
