package com.java.exercise.codes;

public class PrimeNumber {
	
	public static void prime(int x)
	{
		int n = x;
		boolean flag = true;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag)
		{
		System.out.println("The number " +n+" is prime");
	}
		else
		{
			System.out.println("The number "+n+" is not prime");
		}
	}
	public static void main(String[] args) {
		prime(17);
		prime(21);
	}
}