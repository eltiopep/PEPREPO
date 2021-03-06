package basicFood.outils;

import java.util.HashMap;
import java.util.Map.Entry;

public class Recipe extends NutritionProperties {

	private HashMap<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

//constructor
	public Recipe(String recipeName) {
		// this will return an recipe with name and zeroes for all values
		super();
		this.setName(recipeName);
	}

	public HashMap<String, Ingredient> getIngredients() {
		return ingredients;
	}

	public void addIngredient(Ingredient ingredient) {
		this.ingredients.put(ingredient.getName(), ingredient);
		update();
	}

	public void removeIngredient(Ingredient ingredient) {
		boolean found = false;
		Ingredient ingredientRemoved = ingredients.remove(ingredient.getName());
		if (ingredientRemoved != null) {
			// remove OK
			update();
		}
	}

	public void editIngredientWeight(String ingredientName, Double newWeight) {
		Ingredient oldIngr;
		oldIngr = ingredients.get(ingredientName);
		if (oldIngr != null) {
			oldIngr.updateBecauseWeightChange(newWeight);
			update();
		}
	}

	private void update() {
		// update the adding of all ingredients.

		Double totalWeight, totalSugar, totalHc, totalFat, totalSatFat, totalProtein, totalSalt, totalKcal, totalFiber;
		totalWeight = totalSugar = totalHc = totalFat = totalSatFat = totalProtein = totalSalt = totalKcal = totalFiber = 0.0;

		for (Entry<String, Ingredient> entry : ingredients.entrySet()) {
			Ingredient ingredient = entry.getValue();
			totalWeight += ingredient.getWeight();
			totalFat += ingredient.getFat();
			totalSatFat += ingredient.getSatfat();
			totalHc += ingredient.getHc();
			totalSugar += ingredient.getSugar();
			totalProtein += ingredient.getProtein();
			totalSalt += ingredient.getSalt();
			totalFiber += ingredient.getFiber();
			totalKcal += ingredient.getKcal();
		}
		this.setAllButName(totalKcal, totalFat, totalSatFat, totalHc, totalSugar, totalProtein, totalSalt, totalFiber,
				totalWeight);
	}

	@Override
	public String toString() {
		return "Recipe [ingredients=" + ingredients + "]";
	}

}
