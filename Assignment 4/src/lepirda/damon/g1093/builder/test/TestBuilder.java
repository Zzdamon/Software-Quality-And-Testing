package lepirda.damon.g1093.builder.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import lepirda.damon.g1093.builder.Server;
import lepirda.damon.g1093.builder.ServiceInterface;

public class TestBuilder {

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
	public void testBuilderNoServices() {
		Server server= new Server.ServerBuilder("15.13.25.10", 3000, 4).build();
		assertEquals("Testing builder with no added attributes", server.getServiceSize(), 0);
	}
	@Test 
	public void testBuilderWithAddedServices() {
		Server server= new Server.ServerBuilder("15.13.25.10", 3000, 4).addCors().addDbContext().addSignalR().build();
	
		assertEquals("Testing builder with no added attributes", server.getServiceSize(), 3);
	}

}
