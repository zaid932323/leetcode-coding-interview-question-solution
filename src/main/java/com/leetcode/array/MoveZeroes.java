package com.leetcode.array;

// Asked By Facebook
public class MoveZeroes {

	public static int[] moveZeros(int[] nums) {
		int count = 0;
		int[] result = new int[nums.length];
		int k = 0;
		for (int num : nums) {
			if (num == 0) {
				count++;
				continue;
			} else {
				result[k] = num;
				k++;
			}
		}

		for (int i = 1; i <= count; i++) {
			result[k++] = 0;
		}
		return result;
	}
	
public static void main(String[] args) {
		
		int [] result=moveZeros(new int[]{1,2,0,3,0,4});
         System.out.println(result);
		
	}
		
}






