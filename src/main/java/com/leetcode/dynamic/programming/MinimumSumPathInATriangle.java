package com.leetcode.dynamic.programming;

//leetcode

public class MinimumSumPathInATriangle {

	// Util function to find minimum sum for a path
	  static int helper(int A[][], int i, int j)
	  {
	 
	    // Base Case 
	    if(i == A.length){
	      return 0 ;
	    }
	 
	    int mn ;
	 
	    // Add current to the minimum  of the next paths
	    mn = A[i][j] + Math.min(helper(A, i+1,j), helper(A,i+1, j+1)) ;
	 
	    //return minimum
	    return mn ;
	  }
	  static int minSumPath(int A[][]) {
	    return helper(A, 0, 0) ;
	  }
	 
	  /* Driver program to test above functions */
	  public static void main(String[] args)
	  {
	    int triangle [][] = { { 2 },
	                         { 3, 9 },
	                         { 1, 6, 7 }  };
	    System.out.print(minSumPath(triangle));
	  }
	}
