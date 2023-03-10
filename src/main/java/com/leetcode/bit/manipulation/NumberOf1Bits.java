package com.leetcode.bit.manipulation;

//leetcode

public class NumberOf1Bits {

	 public int hammingWeight(int n) {
	        // initialize count with zero
	        int count = 0;
	        int mask = 1;
	        for (int i = 0; i < 32; i++) {
	            // if bitwise and operation between n and mask is zero then increase count by one
	            if ((n & mask) != 0) {
	                count++;
	            }
	            // shift 1 bit left to do the check
	            mask <<= 1;
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		
		 NumberOf1Bits n = new NumberOf1Bits();
		 
		 System.out.println(n.hammingWeight(99098777));
	}
}
