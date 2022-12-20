package com.leetcode.array;
//Asked By Google
public class BuyAndSellStock2 {

	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i-1] < prices[i])
				profit += prices[i] - prices[i-1];
		}
		return profit;
	}
	public static void main(String[] args) {
		//decreasing profit
		   int[] data = {5, 8, 3, 4, 5,  4, 6, 7,  8};
	        System.out.println(maxProfit(data));
	    }
		
		
	}

