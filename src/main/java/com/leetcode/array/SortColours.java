package com.leetcode.array;
//Asked By Facebook
public class SortColours {

	public static  void sortColors(int[] nums) {
		int left = 0, mid = 0, right = nums.length - 1;
		while (mid <= right) {
			if(nums[mid] == 0) {
				swap(left, mid, nums);
				left++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			}else {
				swap(mid, right, nums);
				right--;
			}
		}
	}
	private static  void swap(int i, int j, int[] nums) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	
//	 public static void main(String[] args) {
//			
//		 int [] result=sortColors();
//         System.out.println(result);
//	    }
}
