package com.leetcode.bit.manipulation;

//leetcode

public class ReverseBits {

	public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }
	public static void main(String[] args) {
		
		ReverseBits rb = new ReverseBits();
		
		System.out.println(rb.reverseBits(89));
	}
}
