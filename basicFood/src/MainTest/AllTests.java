package MainTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import basicFood.tests.*;
import commonOutils.ToolBox;
@RunWith(Suite.class)
@SuiteClasses({
	AlimentTest.class,
	FoodParserTest.class,
	IngredientTest.class,
	RecipeTest.class,
	ToolBoxTest.class
})



public class AllTests {
	

}
