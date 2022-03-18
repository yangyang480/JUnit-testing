import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers") //name will shows on the console
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        //assertAll will check all the session, even the first one of them fail.
        //group the asserts by using lambda experssion
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)), //asserEquals won't run the rest if the first one fails.
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    void foursubtractiontwoShouldequaltwo(){ //name of the test specify the name
        //we want to call the subtraction method
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtraction(4,2));//we want to verify the result equal 2 by using assertEqueals
        //the first prameter will be what I expected, second parameter should be the actucally result.
        //assertTrue: test will pass if when the expected is true
        //assertFaulse: assertNull; assertNotNull
        assertTrue(calculator.subtraction(4,2) == 2);
    }

}