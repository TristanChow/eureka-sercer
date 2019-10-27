package com.day.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
	
		HashMap map = new HashMap();
		map.put(new Person("AA",1), new Person("AA",1));
		map.put(new Person("AA",1), new Person("AA",2));
		map.put(new Person("BB",2), new Person("BB",2));
		map.put(new Person("CC",3), new Person("CC",3));
		
		
		Set set = map.keySet();
		for(Object s:set) {
			System.out.println(s);
		}
		System.out.println("======");
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("======");
		Collection c = map.values();
		for (Object object : c) {
			System.out.println("value:"+object);
		}
		
		System.out.println("======");
		Set s = map.keySet();
		
		for (Object object : s) {
			System.out.println(object+"======"+map.get(object));
		}
	
		System.out.println(map);
		
		System.out.println("======");
		
		Set set2 = map.entrySet();
		for (Object o : set2) {		
			Map.Entry entry = (Entry<Person, Person>) o;
			System.out.println(entry.getKey()+"======"+entry.getValue());
		}
	}

}
