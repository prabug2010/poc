package com.java.exercise.codes;

public class VowelsCountAndOccurence {
	
	public static void vowels(String str)
	{
		String s = str;
		s.toLowerCase();
		int n = s.length();
		int count=0;
		for(int i=0; i<n; i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("The vowels in the string are : "+ch);
			}
		}
	}

	public static void main(String[] args) {

		vowels("An unique obj");
	}

}
