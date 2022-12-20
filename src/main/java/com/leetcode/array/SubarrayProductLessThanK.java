package com.leetcode.array;

// Asked By GoldenMan Sachs

//Input: nums = [10, 5, 2, 6], k = 100
//Output: 8
//Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
//Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
public class SubarrayProductLessThanK {
	
	static int countsubarray(int array[], int n, int k)
    {
        int count = 0;
        int i, j, mul;
 
        for (i = 0; i < n; i++) {
 
            // Counter for single element
            if (array[i] < k)
                count++;
 
            mul = array[i];
 
            for (j = i + 1; j < n; j++) {
 
                // Multiple subarray
                mul = mul * array[j];
 
                // If this multiple is less
                // than k, then increment
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
 
        return count;
    }
 
    
    public static void main(String args[])
    {
        int array[] =  {10, 5, 2, 6};
        int k = 100;
        int size = array.length;
 
        int count = countsubarray(array, size, k);
        System.out.print(count);
        
        
    }
}
