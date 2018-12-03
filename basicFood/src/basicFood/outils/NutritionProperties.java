package basicFood.outils;

import java.util.ArrayList;
import java.util.HashMap;

import commonOutils.ToolBox;

public abstract class NutritionProperties {
	private String name;
	private Double kcal, fat, satfat, hc, sugar, protein, salt, weight;

	public NutritionProperties() {

	}

	public NutritionProperties(String name, Double kcal, Double fat, Double satfat, Double hc, Double sugar,
			Double protein, Double salt, Double weight) {
		super();
		setAll(name, kcal, fat, satfat, hc, sugar, protein, salt, weight);
	}

	public void setAll(String name, Double kcal, Double fat, Double satfat, Double hc, Double sugar, Double protein,
			Double salt, Double weight) {
		this.name = name;
		setAllButName(kcal, fat, satfat, hc, sugar, protein, salt, weight);
	}

	public void setAllButName(Double kcal, Double fat, Double satfat, Double hc, Double sugar, Double protein,
			Double salt, Double weight) {
		this.kcal = kcal;
		this.fat = fat;
		this.satfat = satfat;
		this.hc = hc;
		this.sugar = sugar;
		this.protein = protein;
		this.salt = salt;
		this.weight = weight;
	}

	private void calcKcal() {
		setKcal((this.fat * 9 + ((this.hc + this.protein) * 4)));
	}

	public Double getKcal() {
		return kcal;
	}

	public void setKcal(Double kcal) {
		this.kcal = kcal;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getSatfat() {
		return satfat;
	}

	public void setSatfat(Double satfat) {
		this.satfat = satfat;
	}

	public Double getHc() {
		return hc;
	}

	public void setHc(Double hc) {
		this.hc = hc;
	}

	public Double getSugar() {
		return sugar;
	}

	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getSalt() {
		return salt;
	}

	public void setSalt(Double salt) {
		this.salt = salt;
	}

}