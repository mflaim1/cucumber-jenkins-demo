package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorAdditionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldAddTwoPositiveNumbers() {
		assertTrue(calculatorHandler.makeAdditionResponse(3F, 5F) == 8.0);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.makeAdditionResponse(3F, 0F) == 3.0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.makeAdditionResponse(0F, 0F) == 0.0);
	}

}
