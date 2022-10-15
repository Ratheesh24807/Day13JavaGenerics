package com.JavaGenerics;

public class MaximumString {
	
	public static String maxiumOfString(String x,String y, String z)   
	{
		String max = x;
		 if (y.compareTo(max) > 0) {
			return y; // y is the largest now               	
		} if (z.compareTo(max) > 0) {
			return z; // z is the largest now 
		}printMax(x,y,z,max);
		return max;
	}
	
	private static void printMax(String x, String y, String z, String max) {
		
	}

	public static void main(String[] args) {
		
		System.out.println("Maximum number among 3 is = " + maxiumOfString("apple", "Mango","banana"));
		}
}