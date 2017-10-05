package com.java.exercise.codes;

abstract class Add
{
	void add()
	{
		System.out.println("add method invoked");
	}
	abstract void sum();
}
class AbstractClassCode extends Add {
	
void sum()
{
	System.out.println("method implemented");
}
void add()
{
	super.add();
	System.out.println("addition of sub class");
}

}

public class AbsClass
{
	public static void main(String args[])
	{
		AbstractClassCode ab = new AbstractClassCode();
		ab.sum();
		ab.add();
		
		
	}
}
