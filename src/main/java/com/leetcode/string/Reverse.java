package com.leetcode.string;

public class Reverse {
	public static void main(String args[]){ 
		
		char[] z = new char[] {'Z','A','I','D'};
		
		int i=0,j=z.length-1;
		
		char temp;
		while(i<j) {
			temp = z[i];
			z[i] = z[j];
			z[j] = temp;
			
			i++;
			j--;
		}
		System.out.println(z);
		
	}
}
//public void reverseString(char[] s) {
//int len = s.length;
//int left = 0;
//int right = s.length - 1;
//while(left < right) {
//char tmp = s[left];
//s[left] = s[right];
//s[right] = tmp;
//left++;
//right--;
//}
//}








