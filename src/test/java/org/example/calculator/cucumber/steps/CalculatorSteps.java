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

	private int operand1;
	private int operand2;
	private int result;

	private CalculatorHandler calculatorHandler = new CalculatorHandler();

	// TODO: Insert Cucumber Step Definitions Here

	@Given("^the following calculator input:$")
	public void the_following_calculator_input(
			DataTable calculatorInputDataTable) throws Throwable {
		List<Map<String, String>> rows = calculatorInputDataTable.asMaps();
		for (Map<String, String> row : rows) {
			operand1 = Integer.parseInt(row.get("Operand 1"));
			operand2 = Integer.parseInt(row.get("Operand 2"));
		}
	}

	@When("^I do an? addition calculation$")
	public void I_do_a_addition_calculation() throws Throwable {
		result = calculatorHandler.doAddition(operand1, operand2);
	}

	@When("^I do a subtraction calculation$")
	public void I_do_a_subtraction_calculation() throws Throwable {
		result = calculatorHandler.doSubtraction(operand1, operand2);
	}

	@When("^I do a multiplication calculation$")
	public void I_do_a_multiplication_calculation() throws Throwable {
		result = calculatorHandler.doMultiplication(operand1, operand2);
	}

	//TO DO - division step

	@Then("^I expect the result (-?\\d+)$")
	public void I_expect_the_result(int expectedResult) throws Throwable {
		assertTrue(result == expectedResult);
	}
	

}
