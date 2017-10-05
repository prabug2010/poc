package com.java.exercise.codes;

class A
{
int i = 20;
}
class B extends A
{
int i = 10;
}
public class MainClass
{
public static void main(String[] args)
{
A a = new B();
System.out.println(a.i);
}
}
