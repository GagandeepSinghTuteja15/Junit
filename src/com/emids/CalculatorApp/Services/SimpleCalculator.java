package com.emids.CalculatorApp.Services;

public class SimpleCalculator {
	public static int add(String numbers) {
		String delimeter = ",|\n|;";
		String[] arrayNumber = numbers.split(delimeter);
		if (numbers.isEmpty())
			return 0;
		else {
			int sum = 0;
			for (String number : arrayNumber) {
				char[] array = number.toCharArray();
				String num = "";
				for (int i = 0; i < array.length; i++) {
					if (array[i] >= '0' && array[i] <= '9') {

						num = num + array[i];
					}
				}

				int digit = Integer.parseInt(num);
				sum = sum + digit;
			}

		
		return sum;
	}
}
}