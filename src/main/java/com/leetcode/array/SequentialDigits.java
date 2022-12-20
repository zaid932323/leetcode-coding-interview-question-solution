package com.leetcode.array;

import java.util.Vector;

// Asked By Facebook
public class SequentialDigits {
	static Vector<Integer> sequentialDigits(int n)
	  {
	    Vector<Integer> arr = new Vector<Integer>();
	 
	    // Stores the first N-digit
	    // sequential number
	    // (123 ... N times)
	    long num = 0;
	    for (int j = 0; j < n; j++)
	      num = num * 10 + (j + 1);
	 
	    // Stores the difference
	    // (111 ... N times)
	    int add = 0;
	    for (int i = 0; i < n; i++)
	      add = add * 10 + 1;
	 
	    while (num % 10 > 0 && num % 10 <= 9
	           && Math.floor(Math.log10(num) + 1) == n) {
	 
	      arr.add((int) num);
	      num += add;
	    }
	 
	    return arr;
	  }
	 
	  // Driver Code
	  public static void main(String[] args)
	  {
	    int N = 3;
	    Vector<Integer> ans = sequentialDigits(N);
	 
	    // Print the required numbers
	    for (int it : ans)
	      System.out.print(it +" ");
	  }
	}

