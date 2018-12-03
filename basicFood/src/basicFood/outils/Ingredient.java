package basicFood.outils;

public class Ingredient extends NutritionProperties {

	private Aliment aliment;

	public Ingredient(Aliment aliment, Double weight) {
		super();
		this.setName(aliment.getName());
		updateBecauseWeightChange(weight);
		setAliment(aliment);
	}

	private void setAliment(Aliment aliment2) {
		this.aliment = aliment2;

	}

	public Aliment getAliment() {
		return aliment;
	}

	public void updateBecauseWeightChange(Double weight) {
		// TODO Auto-generated method stub
		Double k = weight / aliment.getWeight();
		this.setFat(aliment.getFat() * k);
		this.setSatfat(aliment.getSatfat() * k);
		this.setHc(aliment.getHc() * k);
		this.setSugar(aliment.getSugar() * k);
		this.setProtein(aliment.getProtein() * k);
		this.setSalt(aliment.getSalt() * k);
		this.setWeight(weight);

	}

}
