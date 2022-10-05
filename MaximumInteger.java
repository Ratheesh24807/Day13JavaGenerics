package com.JavaGenerics;

public class MaximumInteger {
	
	public static int maxiumOfInt(int first, int second, int third)   
	{
		if (first > second && first > third) {
			return first;
		} else if (second > third) {
			return second;
		} else {
			return third;
		}
	}

	public static void main(String[] args) {
		System.out.println("Maximum number among 3 is = " + maxiumOfInt(789, 48, 159));
		System.out.println("Maximum number among 3 is = " + maxiumOfInt(3, 8, 3));
		System.out.println("Maximum number among 3 is = " + maxiumOfInt(33, 1, 3));
	}
}
