package com.leetcode.binary.search;

// Asked By Facebook
public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) return mid;
			
			if (nums[left] <= nums[mid]) { // left to right is sorted
			if (nums[left] <= target && target < nums[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}else {// mid to right is sorted
			if(nums[mid] < target && target <= nums[right])
				left = mid + 1;
			else 
				right = mid - 1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		
//		SearchInRotatedSortedArray sisa = new SearchInRotatedSortedArray();
//		int[] nums = {0,1,0,3,12};
//	System.out.println(sisa.search(nums, 88));
		
		
		
	}
	
	
	
	
	

}