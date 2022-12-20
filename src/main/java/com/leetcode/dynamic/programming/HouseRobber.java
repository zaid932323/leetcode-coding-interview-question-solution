package com.leetcode.dynamic.programming;

//leetcode

public class HouseRobber {

	static int maxAmount(int arr[], int n)
	{
		if (n == 0)
			return 0;

		int v1 = arr[0];
		if (n == 1)
			return v1;

		int v2 = Math.max(arr[0], arr[1]);
		if (n == 2)
			return v2;
		int max_val = 0;
		for (int i = 2; i < n; i++) {
			max_val = Math.max(arr[i] + v1, v2);
			v1 = v2;
			v2 = max_val;
		}
		return max_val;
	}
	public static void main(String[] args)
	{
		int arr[] = { 6, 7, 1, 3, 8, 2, 4 };
		int n = arr.length;
		System.out.println("Maximum loot possible : "
						+ maxAmount(arr, n));
	}
}
