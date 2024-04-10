import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() { //test de sumar usando numeros positivios
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
    public void testRestar_PositiveNumbers_ShouldReturnCorrectSubtraction() { //test de restar usando numeros positivos
        //Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        // Act
        int resultado = calculator.restar(numeroA, numeroB);
        // Assert
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }

    @Test
    public void testMultiplicacion_PositiveNumbers_ShouldReturnCorrectMultiplication() { //test de multiplicar numeros positivos
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        // Act
        int resultado = calculator.multiplicacion(numeroA, numeroB);
        // Assert
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }

    @Test
    public void testDivision_PositiveNumbers_ShouldReturnCorrectDivision() {//test de dividir numeros positivos
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 5;
        // Act
        double resultado = calculator.division(numeroA, numeroB);
        // Assert
        assertEquals(2, resultado, "10 / 5 deberia ser 2");
    }

    @Test
    public void testDivision_DivideByZero_ShouldThrowArithmeticException() {// test para el comportamiento de un numero entero dividido por 0
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = 0;
        assertThrows(ArithmeticException.class, () -> { //excepcion para el caso de divir un numero entre 0
            calculator.division(numeroA, numeroB);
        });
    }

    @Test
    public void testDivision_DivideNegativeByPositive_ShouldReturnNegativeResult() {//test de divir con el numerador negativo
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = -10;
        int numeroB = 5;
        // Act
        double resultado = calculator.division(numeroA, numeroB);
        // Assert
        assertEquals(-2, resultado, "-10 / 5 deberia ser -2");
    }

    @Test
    public void testDivision_DividePositiveByNegative_ShouldReturnNegativeResult() {// test de dividir con el denominador negativo
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 10;
        int numeroB = -5;
        // Act
        double resultado = calculator.division(numeroA, numeroB);
        // Assert
        assertEquals(-2, resultado, "10 / -5 deberia ser -2");
    }

    @Test
    public void testDivision_DivideNegativeByNegative_ShouldReturnPositiveResult() {// test de dividir dos numeros negativos
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = -10;
        int numeroB = -5;
        // Act
        double resultado = calculator.division(numeroA, numeroB);
        // Assert
        assertEquals(2, resultado, "-10 / -5 deberia ser 2");
    }

    @Test
    public void testDivision_LargeNumbers_ShouldReturnCorrectResult() {//test de dividir numeros muy grandes
        // Arrange
        Calculator calculator = new Calculator();
        int numeroA = 1000000;
        int numeroB = 500000;
        // Act
        double resultado = calculator.division(numeroA, numeroB);
        // Assert
        assertEquals(2, resultado, "1000000 / 500000 deberia ser 2");
    }
}

