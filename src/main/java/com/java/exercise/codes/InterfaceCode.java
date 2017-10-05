package com.java.exercise.codes;

interface inter
{
	void m1();
	void m2();
}

interface inter2 extends inter
{
	void m3();
}

public class InterfaceCode implements inter2
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
		System.out.println("m3");
	}
	public static void main(String args[])
	{
		InterfaceCode i = new InterfaceCode();
		i.m1();
		i.m2();
		i.m3();
	}
}
