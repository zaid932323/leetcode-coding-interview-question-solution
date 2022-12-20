package com.leetcode.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

//Asked By Microsoft

public class Combination3 {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        comboHelper(1, n, k, new ArrayList<Integer>(), ans);

        return ans;
    }

    private void comboHelper(int start, int remain, int k, List<Integer> combo, List<List<Integer>> ans) {
        if (remain == 0) {
            if (combo.size() == k) {
                ans.add(new ArrayList<Integer>(combo));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            combo.add(i);
            comboHelper(i + 1, remain - i, k, combo, ans);
            combo.remove(combo.size() - 1);
        }
    }
    public static void main(String[] args) {
		
    	Combination3 c3 = new Combination3();
    	
    	System.out.println(c3.combinationSum3(3, 9));
	}
}
