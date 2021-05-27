package ro.ase.csie.cts.g1092.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

public class TestStudent {

	static Student student;
	static ArrayList<Integer> grades;
	static String initialName="John";
	static int initialAge= 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//read data from files
		grades= new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades=null;
	}	

	@Before
	public void setUp() throws Exception {
		student= new Student(initialName,initialAge,grades);

	}

	@After
	public void tearDown() throws Exception {
		student=null;
		//close files, delete files etc
		
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		
		String newName= "George";
		student.setName(newName);
		assertEquals("Testing with a proper name", newName,student.getName());
	}

	@Test
	public void testSetAgeConformanceForRightInput() {
		int newAge=initialAge+1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with right values", newAge,student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for right data"); //fail and assertEquals stop the execution - like a return statement
		}
	}
	
	@Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge=initialAge * -1;
		try {
			student.setAge(newAge);
			fail("We didn't get the exception");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
		
	}
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException {
		String newName="Io";
		student.setName(newName);
	}
}
