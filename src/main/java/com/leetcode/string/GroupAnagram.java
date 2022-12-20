package com.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagram {
        public List<List<String>> groupsAnagrams(String[] strs){
        	Map<String, List<String>> map = new HashMap<>();
        	for (String word : strs) {
        		char[] ca = word.toCharArray();
        		Arrays.sort(ca);
        		String str = new String(ca);
        		if(!map.containsKey(str))
        			map.put(str, new ArrayList<>());
        		map.get(str).add(word);
        	}
        	return new ArrayList<>(map.values());
        }
        public static void main(String[] args)  {
			
        	 String[] words = {"pop","bat","tab","opp","ate","eat","tea","limes","miles","slime","smile"};
        	 
        	 GroupAnagram ga = new GroupAnagram(); 
        	 
        	 System.out.println(ga.groupsAnagrams(words));
        	 
        	 
        	
		}
	
}
