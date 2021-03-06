package lepirda.damon.g1093.prototype.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import lepirda.damon.g1093.prototype.Server;

public class TestPrototype {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testIfCloneImplemented() {
		Server server= new Server(8080, 5, "5.14.27.11");
		try {
			Server serverCopy=(Server)server.clone();
		} catch (CloneNotSupportedException e) {
			fail("We got an exception"); 
		}
	}
	
	@Test
	public void testCloneForShallowCopy() throws CloneNotSupportedException {
		Server server= new Server(8080, 5, "5.14.27.11");
		Server serverCopy=(Server)server.clone();
		assertNotEquals("Testing ipAddress for shallow copy", server, serverCopy);
	}

}
