package com.day.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '周';
		
		String s = "Hello";
		s = s + "world!";
		System.out.println(s);
		
		Collection l =Collections.synchronizedCollection(new ArrayList<String>());
		List<String> list = new ArrayList<String>();
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "AA");
		map.put(0, "BB");
		
		System.out.println(map.toString());
	}

}
