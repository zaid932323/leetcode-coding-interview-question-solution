package com.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapRepeatedDnaSequence {
	 public List<String> findRepeatedDnaSequences(String s) {
	        Map<String, Integer> map = new HashMap<>();
	        for (int i = 0; i <= s.length() - 10; i++) {
	            String substring = s.substring(i, i + 10);
	            map.put(substring, map.getOrDefault(substring, 0) + 1);
	        }
	        List<String> res = new ArrayList<>();
	        for (Map.Entry<String, Integer> item : map.entrySet()) {
	            if (item.getValue() > 1) {
	                res.add(item.getKey());
	            }
	        }
	        return res;
	    }
	 public static void main(String args[]){ 
		 
		 HashMapRepeatedDnaSequence hm = new HashMapRepeatedDnaSequence();
		 
		 System.out.println(hm.findRepeatedDnaSequences("AAAAACCCCC"));
		 System.out.println(hm.findRepeatedDnaSequences("CCCCCAAAAA"));
	 }
}
