package com.leetcode.bit.manipulation;

//leetcode

public class ComplementOfBase10Integer {

	// Function to find the complement
	  static int findComplement(int num)
	  {
	    int ans = 0, x;
	    for (int i = 0; num > 0; i++) {
	      if (num % 2 == 1) {
	        x = 0;
	      }
	      else {
	        x = 1;
	      }
	      ans += (int)Math.pow(2, i) * x;
	      num /= 2;
	    }
	    return ans;
	  }
	 
	  
	  public static void main(String[] args)
	  {
	    int N = 5;
	    System.out.print(findComplement((int)N));
	  }
}
