package com.java.exercise.codes;

public class DupsInArray {
	
	public static void dups()
	{

	String[] s = new String[] {"aaa","bbb","ccc","bbb","ddd","ddd","aaa"};
	int x = s.length;
	for(int i =0; i<x; i++)
	{
		for(int j=i+1; j<x; j++)
		{
			if( (s[i].equals(s[j])))
			{
				System.out.println("duplicates are : "+s[i]);
			}
		}
	}
	}
	
	public static void main(String[] args) {

		dups();
	}

}
