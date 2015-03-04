package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorDivisionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldDivideTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doDivision(15F, 5F) == 3.0);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doDivision(0F, 6F) == 0.0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doDivision(10F, -2F) == -5.0);
	}

}
