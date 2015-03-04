package org.example.calculator.handler;

public class CalculatorHandler {

	public Float doAddition(Float operand1, Float operand2) {
		Float result = operand1 + operand2;
		return result;
	}

	public Float doSubtraction(Float operand1, Float operand2) {
		Float result = operand1 - operand2;
		return result;
	}

	public Float doMultiplication(Float operand1, Float operand2) {
		Float result = operand1 * operand2;
		return result;
	}

	public Float doDivision(Float operand1, Float operand2) {
		Float result = operand1 / operand2;
		return result;
	}

}
