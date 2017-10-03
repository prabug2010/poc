package com.java.exercise.codes;

public class ArmstrongNumber {
	
	public static void armstrong(int n)
	{
		int x = n;
		int z=0;
		int  a = 0;
		while(x>0)
		{
			a = (x%10);
			z= z+(a*a*a);
			x=x/10;
		}
		System.out.println(z);
		if(z==n) {
		System.out.println("Number is an armstrong number");
		}
		else
		{
			System.out.println("Number is not an armstrong number");
		}
	}
	public static void main(String args[])
	{
		armstrong(152);
	}

}
