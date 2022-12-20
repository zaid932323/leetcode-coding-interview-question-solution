package com.leetcode.integer;

class Palindrome {
	
	public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return x == revertedNumber || x == revertedNumber/10;
    }
	 
	
	public static void main(String[] args) {
		
		Palindrome sr = new Palindrome();
		//12321
		System.out.println(sr.isPalindrome(1221));
		
	}
	 
	}

