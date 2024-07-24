package com.sujata.demo;

import com.sujata.eexception.NegativeNumberException;

/*
 * R001: Divide two positive integers
 */
public class Divide implements Operation {

	@Override
	public int perform(int number1, int number2) {
		if (number1 < 0 || number2 < 0)
			throw new NegativeNumberException("Negative Number not allowed");
		else
			return number1 / number2;
	}

}
