package com.java.exercise.codes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "live";
		String x = "live";
		char[] ch = s.toCharArray();
		char[] ch2 = x.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		boolean status;
		status = Arrays.equals(ch, ch2);
		if(status)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
	}
}