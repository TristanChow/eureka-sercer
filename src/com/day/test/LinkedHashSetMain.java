package com.day.test;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		LinkedHashSet hashSet = new LinkedHashSet();
		hashSet.add(new User("CC",0));
		hashSet.add(new User("AA",1));
		hashSet.add(new User("AA",0));
		
		System.out.println(hashSet);

	}

}
