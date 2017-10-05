package com.java.exercise.codes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCode {

		
		public static void hashSet()
		{
			HashSet h = new HashSet();
			
			h.add(2);
			h.add(3);
			h.add(4);
			
			System.out.println("The hashset size before removing 2nd element : "+h.size());
			
			Iterator irr = h.iterator();
			while(irr.hasNext())
				System.out.println(irr.next());
			
			h.remove(2);
			System.out.println("The hashset size after removing 2nd element : "+h.size());
			boolean b = h.contains(2);
			System.out.println("The hashset contains element 2 : "+b);
			
			HashSet hs = new  HashSet();
			hs.add(1);
			hs.addAll(h);
			hs.add(5);
			System.out.println("The common elements in hs and h are :");
			for(Object o : hs)
			{
				System.out.println(h.contains(o) ? "yes" : "No" );
			}
			System.out.println("before retaining");
			System.out.println(hs);
			hs.retainAll(h);
			System.out.println("after retaining");
			System.out.println(hs);
		}

		public static void main(String args[])
		{
			hashSet();
		}
}
