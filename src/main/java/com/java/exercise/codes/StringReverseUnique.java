package com.java.exercise.codes;

public class StringReverseUnique {

	public static void main(String[] args) {
		String s = "My name is XXX";
		String[] x = s.split(" ");
		int n = x.length;
		for(int i=n-1; i>=0; i--)
		{
			System.out.print(x[i]+" ");
		}
	}

}
