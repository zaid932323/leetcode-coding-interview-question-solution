package com.leetcode.dynamic.programming;

//Java Program to Find the Area of a Triangle
// Asked By Facebook

public class Traiangle {

	 // Function to calculate the
    // area of the triangle
    static double area(double h, double b)
    {
        // Function returning the value that is
        // area of a triangle
        return (h * b) / 2;
    }
 
    
    public static void main(String[] args)
    {
        // Custom inputs- height and base values
 
        // Height of the triangle
        double h = 10;
 
        // Base of the triangle
        double b = 5;
 
        // Calling area function and
        // printing value corresponding area
        System.out.println("Area of the triangle: "
                           + area(h, b));
    }
}

