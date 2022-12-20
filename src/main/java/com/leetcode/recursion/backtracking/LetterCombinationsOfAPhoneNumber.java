package com.leetcode.recursion.backtracking;

import java.util.LinkedList;
import java.util.List;

//Asked By Google

public class LetterCombinationsOfAPhoneNumber {

	public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if (digits.length() == 0) return list;
        list.add("");
        String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        for (int i = 0; i < digits.length(); i++) { // "234"
            int index = Character.getNumericValue(digits.charAt(i));
            while (list.peek().length() == i) {
                String tmp = list.remove();
                for (char ch : map[index].toCharArray()) {
                    list.add(tmp + ch);
                }
            }
        }
        return list;
    }
	public static void main(String[] args) {
		
		LetterCombinationsOfAPhoneNumber lcopn = new LetterCombinationsOfAPhoneNumber();
		
		System.out.println(lcopn.letterCombinations("99"));
	}
	
}
