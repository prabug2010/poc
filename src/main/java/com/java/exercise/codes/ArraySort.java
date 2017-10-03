package com.java.exercise.codes;

public class ArraySort {
	
	public static void arraySort()
	{
		int[] a = new int[] {4,8,0,3,1,6};
		int n = a.length;
		int temp=0;
		for(int i =0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x=0; x<n; x++)
		{
			System.out.println(a[x]);
		}
		
	}

	public static void main(String[] args) {
		arraySort();
	}

}
