package basicFood.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import basicFood.outils.Aliment;
import basicFood.outils.Ingredient;
import commonOutils.ToolBox;

public class IngredientTest {
	Ingredient i1;
	Ingredient i2;
	Aliment a1;
	Aliment a2;
	Double fuzzy=0.000001;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a1= new Aliment("aliment1",dr(),dr(),dr(),dr(),dr(),dr(),dr(),dr(),dr());
		i1=new Ingredient(a1,dr());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIngredient() {
		a2= new Aliment("aliment2",dr(),dr(),dr(),dr(),dr(),dr(),dr(),dr(),dr());
		i2=new Ingredient(a2,dr());
		assertEquals(i2.getAliment(),a2);
		
	}

	@Test
	public void testGetAliment() {
		assertEquals(i1.getAliment(),a1);
	}

	@Test
	public void testUpdateBecauseWeightChange() {
		
		Double k=dr();
		Double weight=i1.getWeight()*k;
		Double fat=i1.getFat()*k;
		
		i1.updateBecauseWeightChange(weight);
		assertEquals(fat, i1.getFat(),fuzzy);
	}

	private Double dr() {
		return ToolBox.getRandomDouble(0, 30);
	}
}
