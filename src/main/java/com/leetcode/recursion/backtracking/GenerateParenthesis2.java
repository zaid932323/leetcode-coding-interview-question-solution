package com.leetcode.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

//Asked By Facebook,Microsoft,Google,Amazon,LinkedIn

public class GenerateParenthesis2 {

	public void dfs(List<String> list, int max, String str, int open, int close) {
        if (max * 2 == str.length()) {
            list.add(str);
            return;
        }
        if (open < max) {
            dfs(list, max, str + "(", open + 1, close);
        }
        if (close < open) {
            dfs(list, max, str + ")", open, close + 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(list, n, "", 0, 0);
        return list;
    }
    public static void main(String[] args) {
		
    	GenerateParenthesis2 gp2 = new GenerateParenthesis2();
    	
    	System.out.println(gp2.generateParenthesis(3));
	}
}
