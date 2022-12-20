package com.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestStringWithoutRepeatingCharacter {

	public static void main(String args[]){ 
		lengthOfLongestSubString("zaaziddi"); 
	}
	
	public static void lengthOfLongestSubString(String s) {
		String LongestSubstring = null;
		int LongestSubstringLength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
				
			}else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > LongestSubstringLength) {
				LongestSubstringLength = map.size();
				LongestSubstring = map.keySet().toString();
			}
			
		}
		
		System.out.println("The Longest substring : " + LongestSubstring);
		System.out.println("The Longest Substring Length : " + LongestSubstringLength);
		
	}
}
