package com.java.exercise.codes;

import java.util.HashMap;
import java.util.Map;

public class NonRptChar {

	public void nonRepeat(String s)
	{
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		String str = s;
		char[] ch = str.toCharArray();
		for(Character c : ch)
		{
			if(h1.containsKey(c))
			{
				h1.put(c, h1.get(c)+1);
			}
			else
			{
				h1.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : h1.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("Repeated character is : "+e.getKey()+" and the count is : "+e.getValue());
			}
		}
	}
	public static void main(String[] args) {
		NonRptChar nrc = new NonRptChar();
		nrc.nonRepeat("thinking");
		
	}

}
