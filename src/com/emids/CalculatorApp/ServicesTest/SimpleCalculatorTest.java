package com.emids.CalculatorApp.ServicesTest;

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
		Assert.assertEquals(3, SimpleCalculator.add("1,2"));
	}

	@Test
	public final void handleUnknownAmountOfNumber() {
		Assert.assertEquals(10, SimpleCalculator.add("1,2,3,4"));
	}

	@Test
	public final void whenNumbersAreSaperatedByNewLine() {
		Assert.assertEquals(9, SimpleCalculator.add("1\n4\n4"));
	}

	@Test
	public final void whenNumbersAreSaperatedByUnknownDelimeter() {
		Assert.assertEquals(6, SimpleCalculator.add("1,2;3"));
	}

	@Test(expected = RuntimeException.class)
	public final void whenNegativeNumbersPassed() {
		SimpleCalculator.add("-2");

	}

	@Test
	public final void whenNumberIsBiggerThan1000() {
		Assert.assertEquals(3, SimpleCalculator.add("1,2,1111"));
	}

}
