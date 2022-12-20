package com.leetcode.array;
//Asked By Google
public class JumpGame {

	 public static boolean canJump(int[] nums) {
		 int reachable = 0;
		 for (int i = 0; i < nums.length && i <= reachable; i++) {
			 reachable = Math.max(reachable, i + nums[i]);
			 if (reachable >= nums.length - 1)
				 return true;
		 }
		 return false;
	 }
	 
	 public static void main(String[] args) {
		
		//input 2,3,1,1,4 true
		 
		 int[] data = {3,2,1,0,4};
	        System.out.println(canJump(data));
	    }
		 
//		 System.out.println(jg.canJump(true));
//	}
}
