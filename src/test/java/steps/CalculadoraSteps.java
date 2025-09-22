package steps;

import cl.iplacex.Calculadora;
import io.cucumber.java.en.*;   // inglés
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSteps {
    private Calculadora calc;
    private int result;
    private Throwable error;

    @Given("I have a calculator") //Dado que tengo una calculadora
    public void i_have_a_calculator() { calc = new Calculadora(); }

    @When("I add {int} and {int}") //Cuando sumo una variable y otra variable
    public void i_add_numbers(int a, int b) { result = calc.sumar(a, b); }

    @When("I divide {int} by {int}") //Cuando divido una variable y otro variable
    public void i_divide_numbers(int a, int b) {
        try { result = calc.dividir(a, b); } catch (Throwable t) { error = t; }
    }

    @Then("the result should be {int}") //Entonces el resultado debe ser
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }

    @Then("an error of type {string} should occur") //Entonces se produce un error tipo x
    public void an_error_of_type_should_occur(String type) {
        assertNotNull(error, "Expected an exception");
        assertEquals(type, error.getClass().getSimpleName());
    }
}