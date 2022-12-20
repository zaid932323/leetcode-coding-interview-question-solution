package com.leetcode.array;

import java.util.Arrays;
//Asked By MicroSoft

public class MergeSortedArray {

	

	public static void merge(int[] nums1, int[] nums2, int m, int n) {
		 int p1 = m - 1;
		 int p2 = n - 1;
		 for (int i = nums1.length - 1; i >= 0; i--) {
			 int valAtP1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
			 int valAtP2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
			 if (valAtP1 > valAtP2) {
				 nums1[i] = valAtP1;
				 p1--;	
			 } else {
				 
				
				nums1[i] = valAtP2;
				 p2--;
			 }
		 }
		 
	}
	 public static void main(String[] args) {
	        int nums1[] = {1, 3, 5, 7};
	        int m = nums1.length;
	 
	        int nums2[] = {2, 4, 6, 8};
	        int n = nums2.length;
	 
	       
	        merge(nums1, nums2, m, n);
	 
	        System.out.println("Array after merging");
	        for (int i=0; i < m+n; i++)
	            System.out.print(nums1[i] + " ");
	        
	        Arrays.sort(nums1);
	             
	    }
}
