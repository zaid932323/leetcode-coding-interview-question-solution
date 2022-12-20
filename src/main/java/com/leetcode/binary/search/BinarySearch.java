package com.leetcode.binary.search;

import java.util.Arrays;

// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
// if target exists, then return its index.Otherwise,return -1.
public class BinarySearch {
	
	public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}
