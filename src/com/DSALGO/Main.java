package com.DSALGO;
// When we use ArrayList in our project we need to import following package
import java.util.ArrayList;

//for sorting arrayList we need to import following package
import java.util.Collection;
import java.util.Collections;

public class Main {

//    ArrayList in JAVA
//    ArrayList is stored elements in non-contagious form or in HEAP

    public static void main(String[] args) {
	// write your code here
//        Initializing ArrayList in angle brackets there is class of int
//        These are the type of declaring arrayList in java
        ArrayList<Integer> il = new ArrayList<Integer>();
        ArrayList<String> sl = new ArrayList<String>();
        ArrayList<Boolean> bl = new ArrayList<Boolean>();
        ArrayList<Object> ol = new ArrayList<Object>();

//        add element in arrayList
        il.add(1);
        il.add(2);
        il.add(4);
        il.add(5);

//        print arraylist
        System.out.println(il);

//        add element between two elements
        il.add(3,2);
        System.out.println(il);
//        remove element
        il.remove(2);
        System.out.println(il);

//        replace element
        il.set(1,7);
        System.out.println(il);

        // Size or lenght of list

        int size = il.size();
        System.out.println(size);

//        print element
        int firstEle = il.get(0);
        System.out.println(firstEle);
//      Print element using loop

        for(int i = 0; i < size; i++){
            System.out.println(il.get(i));
        }

//        sort arrayList
        Collections.sort(il);
        System.out.println(il);

        KadaneAlgo kd = new KadaneAlgo();
        int arr[] = {1,3,-5,2,-6,8};
        int out = kd.maxSubArraySum(arr);
        System.out.println("Kadane Algo :" + out);

//        N/2 algo

        MajorityAlgo ma = new MajorityAlgo();
        int a[] = {1,1,2,3};
        int r = ma.majorityArr(a);
        System.out.println("Majorty :" + r);

    }
}
