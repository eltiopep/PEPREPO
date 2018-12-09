package MainTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import basicFood.tests.*;
@RunWith(Suite.class)
@SuiteClasses({
	AlimentTest.class,
	FoodParserTest.class,
	IngredientTest.class,
	RecipeTest.class
	
})



public class AllTests {
	

}
