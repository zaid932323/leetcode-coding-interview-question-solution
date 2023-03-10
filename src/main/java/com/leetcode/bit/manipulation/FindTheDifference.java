package com.leetcode.bit.manipulation;

//leetcode

public class FindTheDifference {

	public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); ++i) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            c ^= t.charAt(i);
        }
        return c;
    }
	public static void main(String[] args) {
		
		FindTheDifference ftd = new FindTheDifference();
		
		System.out.println(ftd.findTheDifference("abcde", "abcdef"));
	}
}
