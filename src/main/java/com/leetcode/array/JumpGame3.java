package com.leetcode.array;
   //Asked By Facebook

public class JumpGame3 {

	public boolean canReach(int[] arr, int start) {
		if(start < 0 || start >= arr.length ||  arr[start] < 0) return false;
		
		if (arr[start] == 0) return true;
		
		arr[start] = -1 * arr[start];
		boolean left		= canReach(arr, start + arr[start]);
		boolean right    	= canReach(arr, start - arr[start]);
		
		return left || right;
	}
	
}
