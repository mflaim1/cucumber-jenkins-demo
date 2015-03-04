package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorDivisionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldDivideTwoPositiveNumbers() {
		assertTrue(calculatorHandler.makeDivisionResponse(15F, 5F) == 3.0);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.makeDivisionResponse(0F, 6F) == 0.0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.makeDivisionResponse(10F, -2F) == -5.0);
	}

}
