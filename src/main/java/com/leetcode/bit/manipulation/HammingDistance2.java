package com.leetcode.bit.manipulation;

//leetcode

public class HammingDistance2 {

	public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((xor & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
	public static void main(String[] args) {
		
		HammingDistance2 hd2 = new HammingDistance2();
		
		System.out.println(hd2.hammingDistance(90, 9));
	}
}
