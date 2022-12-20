package com.leetcode.integer;

 class Factorial {
	 public int trailingZeroes(int n) {

	        int count = 0;

	        while(n > 4) {
	            n /= 5;
	            System.out.println(n);
	            count += n;
	        }

	        return count;
	    }
	 public static void main(String[] args) {
			
		 Factorial vr = new Factorial();
			
			System.out.println(vr.trailingZeroes(8));
			
		}
		 
	}

