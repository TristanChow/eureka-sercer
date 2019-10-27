package com.day.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LocalDateMain {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		System.out.println(LocalDate.parse("20190918", formatter));
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDateTime.of(2019, 9, 18, 14, 28));
		
		List<String> list = new ArrayList();
		Stream<String> stream = list.stream();
		
		//System.out::println;

	}

}
