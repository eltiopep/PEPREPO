package basicFood.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import basicFood.outils.Aliment;
import basicFood.outils.Ingredient;
import basicFood.outils.Recipe;
import commonOutils.ToolBox;

public class RecipeTest {
	Recipe recipe;
	Ingredient i1;
	Ingredient i2;
	Aliment a1;
	Aliment a2;
	String name;
	Double fuzzy = 0.000001;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a1 = new Aliment("aliment1", dr(), dr(), dr(), dr(), dr(), dr(), dr(), dr(),dr());
		i1 = new Ingredient(a1, dr());
		a2 = new Aliment("aliment2", dr(), dr(), dr(), dr(), dr(), dr(), dr(), dr(),dr());
		i2 = new Ingredient(a2, dr());
		name = "carxofetes En ou";
		recipe = new Recipe(name);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRecipe() {

		assertEquals(name.toLowerCase(), recipe.getName());
	}

	@Test
	public void testGetIngredients() {
		assertEquals(HashMap.class, recipe.getIngredients().getClass());

	}

	@Test
	public void testAddIngredient() {
		recipe.addIngredient(i2);
		assertEquals(i2.getKcal(), recipe.getIngredients().get(i2.getName()).getKcal(), fuzzy);
	}

	@Test
	public void testRemoveIngredient() {
		recipe.addIngredient(i2);
		assertFalse(recipe.getIngredients().isEmpty());
		recipe.removeIngredient(i2);
		assertTrue(recipe.getIngredients().isEmpty());

	}

	@Test
	public void testRemoveIngredientko() {
		recipe.addIngredient(i2);
		assertFalse(recipe.getIngredients().isEmpty());
		recipe.removeIngredient(i1);
		assertFalse(recipe.getIngredients().isEmpty());
	}

	@Test
	public void testEditIngredientWeight() {
		Double k = dr();
		Double weight = i1.getWeight() * k;
		Double kcal = i1.getKcal() * k;

		recipe.addIngredient(i1);
		recipe.editIngredientWeight(i1.getName(), weight);

		assertEquals(kcal, recipe.getKcal(), fuzzy);

	}

	@Test
	public void testEditIngredientWeightKo() {
		Double k = dr();
		Double weight = i1.getWeight() * k;
		Double kcal = i1.getKcal() * k;

		recipe.addIngredient(i1);
		recipe.editIngredientWeight(i2.getName(), weight);

		assertNotEquals(kcal, recipe.getKcal(), fuzzy);

	}

	private Double dr() {
		return ToolBox.getRandomDouble(0, 30);
	}
}
