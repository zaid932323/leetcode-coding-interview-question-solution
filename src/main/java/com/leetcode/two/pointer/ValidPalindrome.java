package com.leetcode.two.pointer;

// Asked By Facebook

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
           if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
                left++;
                right--;
            } 
        }
        return true;
    }
	public static void main(String[] args) {
		
		ValidPalindrome vp = new ValidPalindrome();
		//A man, a plan: a canal: panama
		System.out.println(vp.isPalindrome("A man, a plan: a canal: panama"));
	//	System.out.println(vp.isPalindrome(" race a car")); middile e
	}
}
