package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorSubtractionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldSubtractTwoPositiveNumbers() {
		assertTrue(calculatorHandler.makeSubtractionResponse(3F, 5F) == -2.0);
	}

	@Test
	public void shouldSubtractOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.makeSubtractionResponse(3F, 0F) == 3.0);
	}

	@Test
	public void shouldSubtractZeroAndZero() {
		assertTrue(calculatorHandler.makeSubtractionResponse(0F, 0F) == 0.0);
	}

}
