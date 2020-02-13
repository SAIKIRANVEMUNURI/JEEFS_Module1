package com.cg.lab6.exercise9;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class DurationOfPeriod {

	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1998, Month.FEBRUARY, 13);

		Period p = Period.between(birthday, today);
		
		System.out.println( p.getYears() + " Years, " + p.getMonths() +
		                   " Months, and " + p.getDays() +
		                   " Days");

	}

}
