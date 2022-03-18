import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



import static org.junit.jupiter.api.Assertions.*;

class ShapeExceptionParameterTest {
    //when we run the test with coverage we can see the green and red bar in the java class, green means we test it already, red means we haven't test haven't touch it yet.
    //parameterizedTest can run a test multiple times with different arguments, different sets of data
    //Test is standard test, parameterizedTest is the other test type.
    //we will use @valueSource
    //ValueSource is the parameter prodivers, we have a lot providers: @ArgumentSource, @CsvSource, @EnumSource....
    @ParameterizedTest(name = "{0}")
    @DisplayName("Should create shaps with different numbers of sides")
    @ValueSource(ints = {3, 4, 5, 6})
    void shouldCreateShapesWithDifferentNumbersOfSides(int exepctedNumberOfSides){
        ShapeExceptionParameter shape = new ShapeExceptionParameter(exepctedNumberOfSides, "Square");
        assertEquals(exepctedNumberOfSides, shape.getNumberOfSides());
    }

    //=========exception===========================
    @ParameterizedTest
    @DisplayName("Should not create shapes with invalid numbers of sides")
    @ValueSource(ints = {0, 1, 2, Integer.MAX_VALUE})
    void shouldNotCreateShapesWithInvalidNumbersOfSides(int expectedNumberOfSides){
        //we will use the lambda expression to check the exception
        assertThrows(IllegalArgumentException.class, () -> new ShapeExceptionParameter(expectedNumberOfSides, "Square"));
    }

    //==========nested========================
    @Nested
    @DisplayName("When a shape has been created")
    class WhenShapeExists{
        private final ShapeExceptionParameter shapeExceptionParameter = new ShapeExceptionParameter(4, "Square");

        @Nested
        @DisplayName("Should allow")
        class ShouldAllow
        {
            @Test
            @DisplayName("seeing the number of sides")
            void seeingTheNumberOfSides()
            {
                assertEquals(4,shapeExceptionParameter.getNumberOfSides());
            }

            @Test
            @DisplayName("seeing the description")
            void seeingTheDescription()
            {
                assertEquals("Square", shapeExceptionParameter.getDescription());
            }
        }

        @Nested
        @DisplayName("Should not")
        class ShouldNot
        {
            @Test
            @DisplayName("be equal to another shape with the same number of sides")
            void beEqualToAnotherShapeWithTheSameNumberOfSides()
            {
                assertNotEquals(new ShapeExceptionParameter(4, "Square"), shapeExceptionParameter);
            }
        }
    }
}

//these are the basic test cases. we don't really test out code with sout within the method. we want to simplify our code in test file.
//When we want to test code in database we want to use mock to pretend the action, so that we don't change the database
//BeforeAll:Setup initialize db
//BeforeEach: seed data/query data
//@Test
//AfterEach: clean data/ reset query
//AfterAll: close database connection