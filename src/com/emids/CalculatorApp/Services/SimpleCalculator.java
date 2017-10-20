package com.emids.CalculatorApp.Services;

public class SimpleCalculator {
public static int add(String numbers)
{
String[] ArrayNumeber= numbers.split(",");	
if(ArrayNumeber.length==0)
	return 0;

int sum=0;
for (String number : ArrayNumeber) {
	int digit=Integer.parseInt(number);
	sum+=digit;
}
return sum;
}
}
