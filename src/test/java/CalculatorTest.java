import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("calculator test")
class CalculatorTest {

    @Test
    @DisplayName("can add")
    public void testAdd() {
        Calculator calculator = new Calculator();
        float result = calculator.add(5.0f, 3.0f);
        // using a delta of 0.001f to account for small floating-point differences.
        assertEquals(8.0f, result, 0.001f, "Addition result is incorrect");
    }

    @Test
    @DisplayName("can subtract")
    public void testSub() {
        Calculator calculator = new Calculator();
        float result = calculator.sub(5.0f, 3.0f);
        // using a delta of 0.001f to account for small floating-point differences.
        assertEquals(2.0f, result, 0.001f, "Subtraction result is incorrect");
    }

    @Test
    @DisplayName("can multiply")
    public void testMul() {
        Calculator calculator = new Calculator();
        float result = calculator.mul(5.0f, 3.0f);
        // using a delta of 0.001f to account for small floating-point differences.
        assertEquals(15.0f, result, 0.001f, "Multiplication result is incorrect");
    }

    @Test
    @DisplayName("can divide")
    public void testDiv() {
        Calculator calculator = new Calculator();
        float result = calculator.div(6.0f, 3.0f);
        // using a delta of 0.001f to account for small floating-point differences.
        assertEquals(2.0f, result, 0.001f, "Division result is incorrect");
    }

    @Test
    @DisplayName("throws exception if trying to divide by zero")
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.div(5.0f, 0.0f),
                "Division by zero should throw an ArithmeticException"
        );
    }
}