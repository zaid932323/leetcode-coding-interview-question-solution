package com.leetcode.binary.search;

import java.util.ArrayList;
import java.util.List;

// asked by facebook
public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > list.get(list.size()-1))
                list.add(arr[i]);
            else{
                int j = binSearch(list, arr[i]);
                list.set(j, arr[i]);
            }
        }
        return list.size();
    }
    public int binSearch(List<Integer> list, int val) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (val > list.get(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
    public static void main(String[] args) {
    	LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
    	
    	System.out.println(lis.lengthOfLIS(null));
    	System.out.println(lis.binSearch(null, 2));
	}
}
