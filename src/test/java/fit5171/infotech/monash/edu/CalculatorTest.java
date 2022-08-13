package fit5171.infotech.monash.edu;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;

/**
 * Created Ayesha Sadiq on 6/03/15.
 */

@DisplayName("A calculator test class")//test class, Test classes must not be abstract and must have a single constructor.
public class CalculatorTest { 
    
	private Calculator calculator;

    //Lifecycle Method: any method that is directly annotated or meta-annotated with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.
    @BeforeAll
    static void initAll() {
    	CalculatorTest test = new CalculatorTest();
    }
    
    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    ///Test Method: any instance method that is directly annotated or meta-annotated with @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, or @TestTemplate.
     @Test
     @DisplayName("A test method to test two numbers fetched as strings")
     void testAddition() {
        String x = "0";
        String y = "0";
        assertEquals(0 + 0, calculator.add(x, y));
        //assertEquals(0, calculator.add(x, y));
    }
    @Test
     void testAdd() { 
	    int a = 15; int b = 20; 
	    int expectedResult = 35;
	    //Act 
	    long result = calculator.add(a, b);
	    //result = result+1;
	    //Assert
	    assertEquals(expectedResult, result);
	}

     @Test
     void testSubtract() {
	    int a = 25; int b = 20; 
	    int expectedResult = 5; 
	    long result = calculator.subtract(a, b);
	    assertEquals(expectedResult, result);
    }
    

     @Test
     void testMultiply() {
	    int a = 10; int b = 25;
	    long expectedResult = 250;
	    long result = calculator.multiply(a, b);
	    assertEquals(expectedResult, result);
    }
   
     @Test
     void testDivide() { 
    	int a = 25; int b = 5; 
    	long expectedResult = 5;
    	long result = calculator.divide(a, b);
	    assertEquals(expectedResult, result);
     }
    
     @Test()
     @DisplayName("This test should pass only if the divide by zero exception is caught")
     void testDividebyZero() { 
    	int a = 15; int b = 0;
    	Throwable exception = assertThrows(java.lang.ArithmeticException.class, () -> { 
    		calculator.divide(a, b);	
    	});
    	assertEquals("/ by zero", exception.getMessage());
    }
     
    @AfterAll
    static void tearDownAll() {
    }
}
