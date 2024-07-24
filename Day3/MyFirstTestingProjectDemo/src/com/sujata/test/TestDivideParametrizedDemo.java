package com.sujata.test;
/*
 * As we have imported Assertions class with static import, so can call all static members of class
 * without giving class name Assertions
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.sujata.demo.Divide;
import com.sujata.demo.Operation;
import com.sujata.eexception.NegativeNumberException;

class TestDivideParametrizedDemo {

	private Operation operation;
	
	@BeforeEach
	void setUp() throws Exception {
		operation=new Divide();
	}

	@AfterEach
	void tearDown() throws Exception {
		operation=null;
	}

	@Test
	@DisplayName("50/10")
	void testT001() {
		/*
		 * assertXXX() methods are the static methods of Assertions class
		 */
		assertEquals(5, operation.perform(50, 10));
	}

	@Test
	@DisplayName("0/10")
	void testT002() {
		assertEquals(0, operation.perform(0, 10));
	}
	
	private static Stream<Arguments> valuesForTestCases(){
		return Stream.of(
				Arguments.of(50,0,ArithmeticException.class),
				Arguments.of(-50,10,NegativeNumberException.class),
				Arguments.of(50,-10,NegativeNumberException.class),
				Arguments.of(-50,-10,NegativeNumberException.class),
				Arguments.of(0,-10,NegativeNumberException.class),
				Arguments.of(-50,0,NegativeNumberException.class)
				);
	}
	
	@ParameterizedTest(name="{0} divided by {1}")
	@MethodSource("valuesForTestCases")
	void testDivide(int number1,int number2,Class exception) {
		
		assertThrows(exception, ()->operation.perform(number1, number2));
	}
//	@Test
//	@DisplayName("50/0")
//	void testT003() {
//		assertThrows(ArithmeticException.class,()->operation.perform(50, 0));
//	}
//	
//	@Test
//	@DisplayName("-50/10")
//	void testT004() {
//		assertThrows(NegativeNumberException.class,()->operation.perform(-50, 10));
//	}
//	
//	@Test
//	@DisplayName("50/-10")
//	void testT005() {
//		assertThrows(NegativeNumberException.class,()->operation.perform(50, -10));
//	}
//	
////	@Disabled("Bug fixing happening for Bug#1234")
//	@Test
//	@DisplayName("-50/-10")
//	void testT006() {
//		assertThrows(NegativeNumberException.class,()->operation.perform(-50, -10));
//	}
//	
//	@Test
//	void testT007() {
//		assertThrows(NegativeNumberException.class,()->operation.perform(0, -10));
//	}
//	
//	@Test
//	void testT008() {
//		assertThrows(NegativeNumberException.class,()->operation.perform(-50, 0));
//	}
}
