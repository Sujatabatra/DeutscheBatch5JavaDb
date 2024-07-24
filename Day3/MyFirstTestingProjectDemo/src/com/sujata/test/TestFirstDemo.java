package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFirstDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi i am setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Hi i am tearUpAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hi i am setup");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hi I am tearDown");
		System.out.println("=================");
	}

	@Test
	void testPerform1() {
		System.out.println("Hi I am first Test case");;
	}
	
	@Test
	void testPerform2() {
		System.out.println("Hi I am second Test case");;
	}

}
