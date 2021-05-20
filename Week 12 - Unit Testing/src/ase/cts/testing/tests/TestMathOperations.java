package ase.cts.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ase.cts.testing.models.MathOperations;

public class TestMathOperations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Preparing the test");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Cleaning after the test");

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddNormalValues() {
		int a=5;
		int b=6;
		int excpectedResult=11;
		int actualResult=MathOperations.add(a, b);
		assertEquals("Adding 5 and 6", excpectedResult, actualResult);
		
	}

}
