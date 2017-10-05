package com.java.exercise.codes;

class Animal
{
	void eat()
	{
		System.out.println("Animal eats");

	}
}

class Dog extends Animal
{
	void run()
	{
		super.eat();
		System.out.println("dog runs");
	}
}
class Puppy extends Dog
{
	void bark()
	{
		super.eat();;
		super.run();
		System.out.println("puppy barks lol");
	}
}

public class Overriding {

	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.eat();
		Animal b = new Puppy();
		b.eat();
		Dog d = new Dog();
		d.run();
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.run();
	}

}
