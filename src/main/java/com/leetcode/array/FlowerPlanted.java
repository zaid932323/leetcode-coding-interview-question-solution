package com.leetcode.array;

import java.util.Arrays;
import java.util.List;

//asked By Google
public class FlowerPlanted {
  
//	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
//	        if (flowerbed == null || flowerbed.length == 0) {
//	            return false;
//	        }
//	        
//	        int count = 0;
//	        for (int i = 0; i < flowerbed.length; i++) {
//	            // the curr plot must be empty && the previous plot is empty && the next plot is empty
//	            // exception: the first plot is empty || the last is empty
//	            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
//	            && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
//	                flowerbed[i] = 1;
//	                count++;
//	            }
//	            if (count >= n) {
//	                return true;
//	            }
//	        }
//	        
//	        return false;
//	    }
//		
	public static boolean canPlaceFlowers(List<Boolean> flowerbed, int numberToPlace) {
        int currentPlaced = 0;
        for (int i = 0; i < flowerbed.size(); i++) {
            //if there is no flower, add a flower and increase currentPlaced
            if (!flowerbed.get(i) && !adjacentFlower(flowerbed, i)) {
                flowerbed.set(i, true);
                currentPlaced++;
            }

            if (currentPlaced == numberToPlace) {
                return true;
            }
        }
        return false;
    }

    private static boolean adjacentFlower(List<Boolean> flowerbed, int currPos) {
        if (currPos == 0) {
            return flowerbed.get(currPos + 1);
        } else if (currPos + 1 == flowerbed.size()) {
            return flowerbed.get(currPos - 1);
        } else {
            return flowerbed.get(currPos + 1) || flowerbed.get(currPos - 1);
        }
    }

    public static void main(String[] args) {
        List<Boolean> flowerBed = Arrays.asList(true, true, false, false, false, false, true, false, false);
        if (canPlaceFlowers(flowerBed, 2)) {
            System.out.println("Can placeFlowers is true");
        } else {
            System.out.println("Can placeFlowers is false");
        }
    }
	}

