package basicFood.outils;

public class Aliment extends NutritionProperties {

	public Aliment(String name,Double kcal, Double fat, Double satfat, Double hc, Double sugar, Double protein, Double salt,Double fiber,Double weight) {
		super();
		Double k = 100.0 / weight;
		fat     *= k;
		satfat  *= k;
		hc      *= k;
		sugar   *= k;
		protein *= k;
		salt    *= k;
		kcal    *= k;
		fiber	*= k;
		weight  = 100.0;
		this.setAll(name, kcal, fat, satfat, hc, sugar, protein, salt,fiber, weight);
		}
}
