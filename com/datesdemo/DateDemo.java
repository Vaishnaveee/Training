package com.datesdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		 /*
		  * java.time package was introduced from Java 8/JDK1.8 onwards
		  */
		System.out.println("---current date and time---");
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now(); 
		LocalDateTime ldt = LocalDateTime.now(); 
		System.out.println(ld);//2022-01-31
		System.out.println(lt);//10:28:54.967
		System.out.println(ldt);//2022-01-31T10:28:54.967
		
		System.out.println("---Custom date and time---");
		
		LocalDate cld = LocalDate.of(2020, Month.JANUARY, 1);
		LocalTime clt = LocalTime.of(10, 20, 30, 100);//10:20:30-100
		LocalDateTime cldt = LocalDateTime.of(2021, Month.JANUARY, 10, 10, 30);
		System.out.println(cld);// 2020-01-01
		System.out.println(clt);// 10:20:30.000000100
		System.out.println(cldt);// 2021-01-10T10:30
		
		System.out.println("-----Manipulating Dates----");
		LocalDate mld = LocalDate.now().plusDays(2); //plusMonths, plusYear
		System.out.println(mld); //Adds 2 days to current date
		LocalTime mlt = LocalTime.now().minusMinutes(30);
		System.out.println(mlt);
		
		System.out.println("--customizing current date---");
		LocalDate ccld = LocalDate.now().withDayOfMonth(19).withYear(2021);
		System.out.println(ccld);//2021-01-19
		
		
		
	}
}
