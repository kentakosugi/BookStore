package jp.co.techmatrix.store.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author kosugi
 *
 */
public class ContentBeanTest{
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

	@Before
	public void setUp() throws Exception{
	}

	@After
	public void tearDown() throws Exception{
	}

	@Test
	public void testGetTitle(){
		String expected = "java";
		ContentBean target = new ContentBean();
		target.setTitle(expected);
		assertEquals(expected, target.getTitle());
	}

	@Test
	public void testSetTitle(){
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooks(){
		fail("Not yet implemented");
	}

	@Test
	public void testSetBooks(){
		fail("Not yet implemented");
	}

	@Test
	public void testGetBook(){
		fail("Not yet implemented");
	}

	@Test
	public void testSetBook(){
		fail("Not yet implemented");
	}

	@Test
	public void testSearch(){
		fail("Not yet implemented");
	}

	@Test
	public void testReset(){
		fail("Not yet implemented");
	}

}
