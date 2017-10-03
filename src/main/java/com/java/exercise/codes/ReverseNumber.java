package com.java.exercise.codes;

public class ReverseNumber {
	
	public static void revNumber(int n) {
		int number = n;
		int temp = number;
		int reverse =0;
		while(number>0)
		{
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String args[])
	{
		revNumber(157);
	}

}
