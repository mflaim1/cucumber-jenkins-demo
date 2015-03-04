package org.example.calculator.handler;

public class CalculatorHandler {

	public Float makeAdditionResponse(Float operand1, Float operand2) {
		Float result = operand1 + operand2;
		return result;
	}

	public Float makeSubtractionResponse(Float operand1, Float operand2) {
		Float result = operand1 - operand2;
		return result;
	}

	public Float makeMultiplicationResponse(Float operand1, Float operand2) {
		Float result = operand1 * operand2;
		return result;
	}

	public Float makeDivisionResponse(Float operand1, Float operand2) {
		Float result = operand1 / operand2;
		return result;
	}

}
