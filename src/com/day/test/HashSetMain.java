package com.day.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetMain {
	
	public static void main(String[] args) {
		
		Set hashSet = new LinkedHashSet();
		hashSet.add(new User("AA",1));
		hashSet.add(new User("BB",1));
		hashSet.add(new User("CC",1));
		hashSet.add(new User("DD",1));
		hashSet.add(new User("AA",1));
		hashSet.add(new User("AA",1));
		
		
	
		System.out.println(hashSet);
		
		HashSet hashSet1 = new HashSet();
		
	}
}
