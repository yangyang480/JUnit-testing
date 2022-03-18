import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    //@Disabled("disable the test")
    @DisplayName("negetiveOneShouldReturIllegalAgrumentException") //name will shows on the console
    void negetiveOneShouldReturIllegalAgrumentException()
    {
        Grader grader = new Grader();
        //name of assertThrows should be the method name, we will use lambda.//if we don't use assertThrows the test unit will fail.
        assertThrows(IllegalArgumentException.class,() -> {
        //the code that will run
        grader.determineGrade(-1);
        });
    }

    @Test
    void fiftynineShouldreturnF(){ //create a test method
        Grader grader = new Grader(); //create grader object
        assertEquals('F', grader.determineGrade(59));
    }

    @Test
    void sixtynineShouldreturnD(){
        Grader grader = new Grader();
        assertEquals('D', grader.determineGrade(69));
    }

    @Test
    void seventynineShouldreturnC(){
        Grader grader = new Grader();
        assertEquals('C', grader.determineGrade(79));
    }

    @Test
    void eigttynineShouldreturnB(){
        Grader grader = new Grader();
        assertEquals('B', grader.determineGrade(89));
    }

    @Test
    void nintynineShouldreturnA(){
        Grader grader = new Grader();
        assertEquals('A', grader.determineGrade(99));
    }
}