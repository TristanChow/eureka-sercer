package com.day.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
	
	public static void main(String[] args) {

		 

        List<Staff> staff = Arrays.asList(

                new Staff("mkyong", 30, new BigDecimal(10000)),

                new Staff("jack", 27, new BigDecimal(20000)),

                new Staff("lawrence", 33, new BigDecimal(30000))

        );

 

        // convert inside the map() method directly.

        List<StaffPublic> result = staff.parallelStream().map(temp -> {
        	
        	System.out.println("XXX");

            StaffPublic obj = new StaffPublic();

            obj.setName(temp.getName());

            obj.setAge(temp.getAge());

            if ("mkyong".equals(temp.getName())) {

                obj.setExtra("this field is for mkyong only!");

            }

            return obj;

        }).collect(Collectors.toList());

 

        System.out.println(result);

 

    }
}
