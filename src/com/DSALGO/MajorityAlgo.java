package com.DSALGO;

public class MajorityAlgo {
//    N/2 or Greatest majority of array
    
    public int majorityArr(int arr[]){
        int count1 = 0; //tracking similar values
        int count2 = 0; // tracking similar values
        int currVal = arr[0]; //current value of array
        int res = 0; // result

        if(arr.length == 1){
            res = 1;
        }

        for (int i = 1; i < arr.length; i++){
            if(currVal == arr[i]){
                count1++;
            }
            else {
                currVal = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (currVal == arr[i]){
                count2++;
            }
        }

        if (count2 > arr.length/2){
            res = count2;
        }
        return res;
    }
}
