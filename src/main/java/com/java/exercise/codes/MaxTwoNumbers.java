package com.java.exercise.codes;

public class MaxTwoNumbers {

	public static void main(String args[])
	{
		int[] x = new int[] {24,27,19,20,11};
		int first=0;
		int second=0;
		int n = x.length;
		for(int i=0; i<n; i++)
		{
			if(first<x[i])
			{
				second=first;
				first=x[i];
			}
			else if(second<x[i])
			{
				second=x[i];
			}
		}
		System.out.println("The first max no is : "+first);
		System.out.println("The second max no is : "+second);
	}
}
