package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = { 1921, 1932, 1964, 1988, 1997 })
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calendar calendar = new Calendar(year);
		GregorianCalendar gregCalendar = new GregorianCalendar();
		
		assertEquals(calendar.isLeapYear(), gregCalendar.isLeapYear(year));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1896, 1855, 1600, 2004, 2005, 2400})
	public void equivalence_partitioning_testing(int year) {
		Calendar calendar = new Calendar(year);
		
		assertFalse(calendar.isLeapYear());
	}

}
