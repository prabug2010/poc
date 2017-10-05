package com.java.exercise.codes;

public class Overload {

	
	public void add(long i, int j)
	{
		long k = i+j;
		System.out.println(k);
	}
	
	public void add(int i, int j, int k)
	{
		int l = i+j+k;
		System.out.println(l);
	}
	public static void main(String[] args) {
		Overload a = new Overload();
		a.add(10, 20);
		a.add(10l, 20);
		a.add(1, 2, 3);
		
		
	}

}
