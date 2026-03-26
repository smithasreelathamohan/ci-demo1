package com.example.cidemo1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    private static final Logger log = Logger.getLogger(CalculatorTest.class.getName());

    Calculator calc;
    @BeforeEach
    void setUp(TestInfo testinfo) {
        calc = new Calculator();
        log.info("------Test Started: "+testinfo.getDisplayName() +" ------");
    }
    @AfterEach
    void tearDown(TestInfo testinfo) {
        log.info("------Test Finished: "+testinfo.getDisplayName() +" ------");
    }

    @ParameterizedTest(name = "Add {0} + {1} ")
    @MethodSource("com.example.cidemo1.CalculatorTestData#additionData")
    void testCalculatorAddition(double firstnumber, double secondnumber, double expected)
    {
        double result=calc.addition(firstnumber,secondnumber);
        try{
            assertEquals(expected,result, "\nFailed: "+firstnumber +" + "+secondnumber+" should be = "+expected +" but actual result calculated is "+result);
            log.info("      Addition Test Passed! ");
        }
        catch(AssertionError error)
        {
            log.severe("      Addition Test Failed! ");
            throw error;
        }

    }

    @ParameterizedTest(name = "Subtract {0} - {1} ")
    @MethodSource("com.example.cidemo1.CalculatorTestData#subtractionData")
    void testCalculatorSubtraction(int firstnumber, int secondnumber, int expected) {
        int result=calc.subtraction(firstnumber,secondnumber);
        assertEquals(expected,result,"\nFailed: "+firstnumber +" - "+secondnumber+" should be = "+expected +" but actual result calculated is "+result);
        log.info("      Subtraction Test Passed! ");
    }

    @Test
    @DisplayName("testMultiplyTwoPositiveNumbers")
    void testMultiplyTwoPositiveNumbers(TestInfo testinfo) {
        assertEquals(10,calc.multiplication(-5,-2),testinfo.getDisplayName() +": Failed! ");
        log.info("      Multiplication Test Passed! ");
    }

    @Test
    @DisplayName("testDivideTwoNumbers")
    void testDivideTwoNumbers(TestInfo testinfo) {
        assertEquals(15.5,calc.division(31,2),testinfo.getDisplayName() +": Failed! ");
        log.info("      Division Test Passed! ");
    }

    @Test
    @DisplayName("testDivideByZero")
    void testDivideByZero(TestInfo testinfo){
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0),testinfo.getDisplayName() +": Failed! ");
        log.info("     Division Test Passed! ");
    }

    @ParameterizedTest(name = " Square of {0}")
    @MethodSource("com.example.cidemo1.CalculatorTestData#squareData")
    void testCalculatorSquare(int number, double expected)
    {
        double result=calc.square(number);
        assertEquals(expected,result, "\nFailed: Square of "+number+" should be = "+expected +" but actual result calculated is "+result);
        log.info("      Square Test Passed! ");
    }

    @ParameterizedTest(name = " {0} power of {1} ")
    @MethodSource("com.example.cidemo1.CalculatorTestData#powerData")
    void testCalculatorPower(double number, int exponent, double expected)
    {
        double result=calc.power(number,exponent);
        assertEquals(expected,result, "\nFailed: "+number+" power of "+exponent+" should be = "+expected +" but actual result calculated is "+result);
        log.info("      Power Test Passed! ");
    }

}