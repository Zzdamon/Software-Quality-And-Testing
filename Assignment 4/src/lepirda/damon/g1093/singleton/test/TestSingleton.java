package lepirda.damon.g1093.singleton.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import lepirda.damon.g1093.ServerInterface;
import lepirda.damon.g1093.singleton.Server;

public class TestSingleton {

	static Server server;
	
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
	public void testIfGetServerCreatesMultipleInstances() {
		ServerInterface server1= Server.getServer();
		ServerInterface server2= Server.getServer();
		assertEquals("Testing if only one instance", server1,server2);

		
	}
	
	
}
