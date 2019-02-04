package basicFood.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import commonOutils.ToolBox;

public class ToolBoxTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void testDoubleAlmostEqualDoubleDoubleDouble() {
		assertTrue(ToolBox.doubleAlmostEqual(10.0,10.00002,0.00002));
	}
	@Test
	public void testDoubleAlmostEqualDoubleDoubleDoubleKo() {
		assertFalse(ToolBox.doubleAlmostEqual(10.0,10.00002,0.000019));
	}

	@Test
	public void testDoubleAlmostEqualDoubleDouble() {
		assertTrue(ToolBox.doubleAlmostEqual(10.0,10.000001));
	}
	@Test
	public void testDoubleAlmostEqualDoubleDoubleKo() {
		assertFalse(ToolBox.doubleAlmostEqual(10.0,10.0000011));
	}

	@Test
	public void testGetRandomDouble() {
		Double x = ToolBox.getRandomDouble();
		Double y = ToolBox.getRandomDouble();
		assertNotEquals(x,y);
	}
	@Test
	public void testGetRandomDoubleIntInt() {
		int min,max;
		min=99;
		max=123;
		Double x = ToolBox.getRandomDouble(min,max);
		assertTrue((x>=min)&&(x<=max));
	}

	

	@Test
	public void testVerifyDouble() {
		Double x = 11.11;
		
		assertEquals(ToolBox.verifyDouble(x), x);
	}@Test
	public void testVerifyDoubleNullCase() {
		Double x = null;
		Double zero = 0.0;
		assertEquals(ToolBox.verifyDouble(x),zero );
	}

}
