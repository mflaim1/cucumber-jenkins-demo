package org.example.calculator.cucumber.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.example.calculator.handler.CalculatorHandler;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {

	Float operand1;
	Float operand2;
	Float result;

	CalculatorHandler calculatorHandler = new CalculatorHandler();

	@Given("^the following calculator input:$")
	public void the_following_calculator_input(
			DataTable calculatorInputDataTable) throws Throwable {
		List<Map<String, String>> rows = calculatorInputDataTable.asMaps();
		for (Map<String, String> row : rows) {
			operand1 = Float.parseFloat(row.get("Operand 1"));
			operand2 = Float.parseFloat(row.get("Operand 2"));
		}
	}

	@When("^I get the addition calculation$")
	public void I_get_the_addition_calculation() throws Throwable {
		result = calculatorHandler.makeAdditionResponse(operand1, operand2);
	}

	@When("^I get the subtraction calculation$")
	public void I_get_the_subtraction_calculation() throws Throwable {
		result = calculatorHandler.makeSubtractionResponse(operand1, operand2);
	}

	@When("^I get the multiplication calculation$")
	public void I_get_the_multiplication_calculation() throws Throwable {
		result = calculatorHandler.makeMultiplicationResponse(operand1,
				operand2);
	}

	@When("^I get the division calculation$")
	public void I_get_the_division_calculation() throws Throwable {
		result = calculatorHandler.makeDivisionResponse(operand1, operand2);
	}

	@Then("^I expect the result \"([^\"]*)\"$")
	public void I_expect_the_result(String expectedResult) throws Throwable {
		assertTrue(result == Float.parseFloat(expectedResult));
	}

}