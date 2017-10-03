package com.java.exercise.codes;

public class LargestElementInArray 
{
	public void largestNo()
	{
	int[] n = new int[] {12,15,27,22,25};
	int large = 0;
	int index = 0;
	
	for(int i=0; i<n.length; i++)
	{
		if(large < n[i])
		{
			large = n[i];
			index = i;
		}
	}
	
	System.out.println("The largest no is : "+large+" and the index is : "+index);
	}

	public static void main(String[] args) {
		LargestElementInArray l = new LargestElementInArray();
		l.largestNo();
	}

}