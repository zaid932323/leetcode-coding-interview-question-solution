package com.leetcode.integer;

 class RootOfANumber {

	static  double root(double x, int n) {
		double left = 1.0;
		double right = x;
		double error = 0.001;
		while ((right - left) > error) {
			double mid = (left + right) / 2.0;
			if (multiply(mid, n) > x) {
				right = mid;
			}else {
				left = mid;
			}
		}
		return right;
	}

	private static double multiply(double mid, int n) {
		double ans = 1.0;
		for (int i = 1; i <= n; i++) {
			ans = ans * mid;
		}
		return ans;
	}
	
	public static void main(String args[]){ 
		
		RootOfANumber rn = new RootOfANumber();
		
		System.out.println("Multiplication of Roots:- " + rn.multiply(5, 6));//5*5*5*5*5*5
		//System.out.println(rn.root(5,4));
	}
}
