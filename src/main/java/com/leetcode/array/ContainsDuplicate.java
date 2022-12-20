package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

// Asked By Google
public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}
	 public static void main(String args[]) {
	        int[] data = {1, 2, 3, 4, 5, 1, 4, 6, 7, 2, 8};
	        System.out.println(containsDuplicate(data));
	    }
}
