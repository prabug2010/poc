package com.java.exercise.codes;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("number after swap a : "+a+" & b is : "+b);
	}
}
