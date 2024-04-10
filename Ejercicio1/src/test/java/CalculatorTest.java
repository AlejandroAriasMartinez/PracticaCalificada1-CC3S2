import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculator.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }

    @Test
    public void testRestar_PositiveNumbers_ShouldReturnCorrectSubtraction() {
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        int resultado = calculator.restar(numeroA, numeroB);
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }

    @Test
    public void testMultiplicacion_PositiveNumbers_ShouldReturnCorrectMultiplication() {
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        int resultado = calculator.multiplicacion(numeroA, numeroB);
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }

    @Test
    public void testDivision_PositiveNumbers_ShouldReturnCorrectDivision() {
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        double resultado = calculator.division(numeroA, numeroB);
        assertEquals(2, resultado, "10 / 5 deberia ser 2");
    }

    @Test
    public void testDivision_DivideByZero_ShouldThrowArithmeticException() {
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 0;
        assertThrows(ArithmeticException.class, () -> {
            calculator.division(numeroA, numeroB);
        });
    }

    @Test
    public void testDivision_DivideNegativeByPositive_ShouldReturnNegativeResult() {
        Calculator calculator = new Calculator();
        int numeroA = -10;
        int numeroB = 5;
        double resultado = calculator.division(numeroA, numeroB);
        assertEquals(-2, resultado, "-10 / 5 deberia ser -2");
    }

    @Test
    public void testDivision_DividePositiveByNegative_ShouldReturnNegativeResult() {
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = -5;
        double resultado = calculator.division(numeroA, numeroB);
        assertEquals(-2, resultado, "10 / -5 deberia ser -2");
    }

    @Test
    public void testDivision_DivideNegativeByNegative_ShouldReturnPositiveResult() {
        Calculator calculator = new Calculator();
        int numeroA = -10;
        int numeroB = -5;
        double resultado = calculator.division(numeroA, numeroB);
        assertEquals(2, resultado, "-10 / -5 deberia ser 2");
    }

    @Test
    public void testDivision_LargeNumbers_ShouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        int numeroA = 1000000;
        int numeroB = 500000;
        double resultado = calculator.division(numeroA, numeroB);
        assertEquals(2, resultado, "1000000 / 500000 deberia ser 2");
    }
}

