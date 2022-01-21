package com.DSALGO;

public class KadaneAlgo {
//    Kadane's Algorithms
    public int maxSubArraySum(int arr[]){
        int maxSum = 0; //maximum sum
        int currSum = 0; // currrent sum
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i]; //sum eg. currSum = currSum + arr[i]
            if(currSum > maxSum){ // current sum is greater than maximum sum
                maxSum = currSum; // then change maxSum value to currSum
            }

            if(currSum < 0){ //if currSum is less than 0 or negative
                currSum = 0; // reset the value of currSum
            }
        }

        return maxSum; // finally return maxSum value
    }
}
