package com.datesdemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now(); //todays date
		LocalDate ld2 = LocalDate.of(2022, Month.JANUARY, 10);
		/*
		 * computing difference between dates using Period
		 */
		int days = Period.between(ld2, ld1).getDays();
		int months = Period.between(ld2, ld1).getMonths();
		System.out.println(days);//21
		System.out.println(months);//0
		/*
		 * compute difference using ChronoUnit
		 */
		long d = ChronoUnit.DAYS.between(ld2, ld1);
		long m = ChronoUnit.MONTHS.between(ld2, ld1);
		System.out.println(d); //21
		System.out.println(m); //0	
		/*
		 * Compute difference between 2 times
		 */
		LocalTime currentTime = LocalTime.now(); //current time
		LocalTime transactionTime = LocalTime.of(10, 30);
		
		Duration duration = Duration.between(transactionTime, currentTime);
		
		System.out.println(duration.toMinutes());
		System.out.println(duration.toHours());
		/*
		 * compute duration using chronounit
		 */
		long mins = ChronoUnit.MINUTES.between(transactionTime, currentTime);
		long hours = ChronoUnit.HOURS.between(transactionTime, currentTime);

		System.out.println(mins);
		System.out.println(hours);
	}
}
