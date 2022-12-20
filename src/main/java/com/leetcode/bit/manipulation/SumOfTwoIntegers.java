package com.leetcode.bit.manipulation;

//leetcode

public class SumOfTwoIntegers {

	public int getSum(int a, int b) {
	      int xor = a ^ b;
	      int carry = a & b;
	      if (carry == 0) {
	        return xor;
	      } else {
	        return getSum(xor, carry << 1);
	      }
	    }
	public static void main(String[] args) {
		
		SumOfTwoIntegers so = new SumOfTwoIntegers();
		
		System.out.println(so.getSum(88, 35));
	}
}
