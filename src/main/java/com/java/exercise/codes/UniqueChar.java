package com.java.exercise.codes;

public class UniqueChar {

	public static void main(String[] args) {

		String s = "encyclopedia";
		String x = s.toLowerCase();
		String temp ="";
		String t ="";
		int n = s.length();
		for(int i=0; i<n; i++)
		{
			char ch = x.charAt(i);
			int y = x.indexOf(ch);
			int z = x.lastIndexOf(ch);
			if(y==z)
			{
				System.out.println("The non repeated character is : "+ch);
				temp+=ch;
			}
			if(y!=z)
			{
				System.out.println("repeated char is "+ch);
				t+=ch;
			}
		}
		System.out.println(temp);
		System.out.println(t);
	}
}
