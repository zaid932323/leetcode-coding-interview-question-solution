package com.leetcode.recursion.backtracking;

//Asked By Google

public class PermutationArray {

	 static void permute(java.util.List<Integer> arr, int k){
	        for(int i = k; i < arr.size(); i++){
	            java.util.Collections.swap(arr, i, k);
	            permute(arr, k+1);
	            java.util.Collections.swap(arr, k, i);
	        }
	        if (k == arr.size() -1){
	            System.out.println(java.util.Arrays.toString(arr.toArray()));
	        }
	    }
	    public static void main(String[] args){
	    	PermutationArray.permute(java.util.Arrays.asList(3,4,6,2,1), 0);
	    }
}
