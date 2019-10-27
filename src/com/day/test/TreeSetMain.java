package com.day.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
	
	public static void main(String[] args) {
		Set set = new TreeSet();
//		set.add(new Person("AA",5));
//		set.add(new Person("AA",10));
//		set.add(new Person("BB",6));
//		set.add(new Person("CC",8));
//		set.add(new Person("DD",10));
		set.add(new User("CC",10));
		set.add(new User("AA",10));
		
		
		System.out.println(set);
	}
}
