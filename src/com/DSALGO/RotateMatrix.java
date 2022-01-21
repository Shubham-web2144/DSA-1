package com.DSALGO;
import java.util.Scanner;


public class RotateMatrix {
//    rotate 2D array or matrix in 90 degree angle
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter elements : ");

//        get array value from user
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //       original print array
        System.out.println("Original array");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print('\n');
        }

//        inverse array
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }



//        reverse array elements
        System.out.println("Roteted array");
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
