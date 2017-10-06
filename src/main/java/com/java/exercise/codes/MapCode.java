package com.java.exercise.codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCode {

	public void map()
	{
	HashMap<String, Integer> h = new HashMap<String, Integer>();
	h.put("a", 1);
	h.put("b", 2);
	h.put("c", 3);
	h.putIfAbsent("d", 4);
		
	//converting map to set
	HashSet s = new HashSet(h.keySet());
	HashSet s2 = new HashSet(h.values());
	System.out.println(s);
	System.out.println(s2);

	//iterating for each approach
	System.out.println("for each iteration");
	for(Map.Entry<String, Integer> e : h.entrySet())
	{
		System.out.println(e.getKey()+" : "+e.getValue());
	}
	//iterator approach
	System.out.println("iterator method");
	Iterator i1 = h.entrySet().iterator();
	while(i1.hasNext())
	{
		Map.Entry<String, Integer> e =  (Entry<String, Integer>) i1.next();
		System.out.println(e.getKey()+" : "+e.getValue());
	}
	//key set approach
	System.out.println("key set approach");
	for(String key : h.keySet())
	{
		System.out.println(h.get(key));
	}
	//iterating values
	System.out.println("iterating values approach");
	for(Integer val : h.values())
	{
		System.out.println(val);
	}
	System.out.println("Set view of a hashmap");
	Set s1 = h.entrySet();
	System.out.println(s1);
	
	}
	
	public static void main(String[] args) {
		MapCode m = new MapCode();
		m.map();
	}
}