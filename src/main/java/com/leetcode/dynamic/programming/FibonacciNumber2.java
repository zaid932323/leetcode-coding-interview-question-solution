package com.leetcode.dynamic.programming;

//leetcode

public class FibonacciNumber2 {

	 static int fib(int n)
	    {
	        int a = 0, b = 1, c;
	        if (n == 0)
	            return a;
	        for (int i = 2; i <= n; i++)
	        {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }
	 
	    public static void main (String args[])
	    {
	        int n = 7;
	        System.out.println(fib(n));
	    }
}
