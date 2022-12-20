package com.leetcode.string;

public class Prefix {
	public static void main(String args[]){ 
		String[] words = new String[] {"zaidkhan","zaidahmed","zaidalam","laidshaikh"};
		String prefix = words[0];
		
		for (String word : words) {
			while (word.indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() -1);
			}
		}
			if (!prefix.equals("")) {
				System.out.println(prefix);
			} else {
				System.out.println("There is no Common Logest Prefix");
			}
	}
}
//public String longestCommonPrefix(String[] strs) {
//if (strs.length == 0) return "";
//String prefix = strs[0];
//for (int i = 1; i < strs.length; i++)
//  while (strs[i].indexOf(prefix) != 0) {
//      prefix = prefix.substring(0, prefix.length() - 1);
//      if (prefix.isEmpty()) return "";
//  }        
//return prefix;
//}		
		
		
		
	

