package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorMultiplicationTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldMultiplyTwoPositiveNumbers() {
		assertTrue(calculatorHandler.makeMultiplicationResponse(3F, 5F) == 15.0);
	}

	@Test
	public void shouldMultiplyOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.makeMultiplicationResponse(3F, 0F) == 0.0);
	}

	@Test
	public void shouldMultiplyZeroAndZero() {
		assertTrue(calculatorHandler.makeMultiplicationResponse(0F, 0F) == 0.0);
	}

}
