package com.emids.CalculatorApp.ServicesTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.emids.CalculatorApp.Services.SimpleCalculator;

public class SimpleCalculatorTest {

	@Test
	public final void whenNumbersAreSaperatedByComma() {
		SimpleCalculator.add("1,2");
	}

	@Test
	public final void whenEmptyStringPassedItWillReturnZero() {
		SimpleCalculator.add("");
	}

	@Test
	public final void valueWillBeReturned() {
		Assert.assertArrayEquals(3, SimpleCalculator.add("1,2"));
	}

	@Test
	public final void handleUnknownAmountOfNumber() {
		Assert.assertArrayEquals(10, SimpleCalculator.add("1,2,3,4"));
	}

	@Test
	public final void whenNumbersAreSaperatedByNewLine() {
		Assert.assertArrayEquals(9, SimpleCalculator.add("1\n4\n4"));
	}

	@Test
	public final void whenNumbersAreSaperatedByUnknownDelimeter() {
		Assert.assertArrayEquals(9, SimpleCalculator.add("1\\4#4"));
	}

	@Test(Expected = RuntimeException.class)
	public final void whenNegativeNumbersPassed() {
		SimpleCalculator.add("-2");

	}

	@Test
	public final void whenNumberIsBiggerThan1000() {
		Assert.assertArrayEquals(3, SimpleCalculator.add("1,2,1111"));
	}

}
