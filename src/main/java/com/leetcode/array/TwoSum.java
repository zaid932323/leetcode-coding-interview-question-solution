package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

//Asked By Google
public class TwoSum {
    
	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		HashMap<Integer , Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				ans[0] = i;
				ans[1] = map.get(diff);
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		return ans;
	}
	   public static void main(String[] args) {
	        int[] s = {150,24,79,50,88,345,3};
	        int value = 200;
	        TwoSum r = new TwoSum();
	        int[] a = r.twoSum(s,value);
	        System.out.println(Arrays.toString(a));
	    }
}
