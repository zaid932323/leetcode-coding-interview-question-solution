package com.leetcode.array;
//Asked By Amazon
public class LastWord {

	public int lengthOfLastWord(String s) {
		int right = s.length() - 1;
		while (right >= 0 && s.charAt(right) == ' ') {
			right--;
		}
		int left = right;
		while (left >= 0 && s.charAt(left) != ' ') {
			left--;
		}
		return right - left;
	}
	public static void main(String[] args) {
		
		LastWord lw = new LastWord();
		
		System.out.println(lw.lengthOfLastWord("The Sky Is Very VERYDARK"));
	}
}
