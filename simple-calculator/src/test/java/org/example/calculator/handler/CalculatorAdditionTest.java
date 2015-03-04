package org.example.calculator.handler;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorAdditionTest {

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Test
	public void shouldAddTwoPositiveNumbers() {
		assertTrue(calculatorHandler.doAddition(3F, 5F) == 8.0);
	}

	@Test
	public void shouldAddOnePositiveNumberAndZero() {
		assertTrue(calculatorHandler.doAddition(3F, 0F) == 3.0);
	}

	@Test
	public void shouldAddZeroAndZero() {
		assertTrue(calculatorHandler.doAddition(0F, 0F) == 0.0);
	}

}
