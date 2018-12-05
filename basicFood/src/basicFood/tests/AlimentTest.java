package basicFood.tests;

//TODO
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import basicFood.outils.Aliment;
import commonOutils.ToolBox;

public class AlimentTest {
	String name;
	Double kcal;
	Double fat;
	Double satfat;
	Double hc;
	Double sugar;
	Double protein;
	Double salt;
	Double weight;
	Aliment al;
	Double fuzzy = 0.00001;
	int minVal,maxVal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		minVal=0;
		maxVal=90000;
		Double k;
		name = "nameAl";
		kcal = ToolBox.getRandomDouble(minVal,maxVal);
		fat = ToolBox.getRandomDouble(minVal,maxVal);
		satfat = ToolBox.getRandomDouble(minVal,maxVal);
		hc = ToolBox.getRandomDouble(minVal,maxVal);
		sugar = ToolBox.getRandomDouble(minVal,maxVal);
		protein = ToolBox.getRandomDouble(minVal,maxVal);
		salt = ToolBox.getRandomDouble(minVal,maxVal);
		weight = ToolBox.getRandomDouble(minVal,maxVal);
		al = new Aliment(name, kcal, fat, satfat, hc, sugar, protein, salt, weight);
		k = 100.0 / weight;
		kcal *= k;
		fat *= k;
		satfat *= k;
		hc *= k;
		sugar *= k;
		protein *= k;
		salt *= k;
		weight = 100.0;

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetKcal() {
		assertEquals(kcal, al.getKcal());
		;
	}

	@Test
	public void testSetKcal() {
		kcal = ToolBox.getRandomDouble(minVal,maxVal);
		al.setKcal(kcal);
		assertEquals(kcal, al.getKcal(), fuzzy);
	}

	@Test
	public void testCalcKcal() {
		hc = ToolBox.getRandomDouble(minVal,maxVal);
		fat = ToolBox.getRandomDouble(minVal,maxVal);
		protein = ToolBox.getRandomDouble(minVal,maxVal);
		kcal = hc * 4 + protein * 4 + fat * 9;
		al.setHc(hc);
		al.setFat(fat);
		al.setProtein(protein);
		al.calcKcal();
		assertEquals(kcal, al.getKcal(), fuzzy);
	}

	@Test
	public void testGetWeight() {
		assertEquals(weight, al.getWeight(), fuzzy);
	}

	@Test
	public void testSetWeight() {
		assertEquals(weight, al.getWeight());
	}

	@Test
	public void testGetName() {
		assertEquals(name.toLowerCase(), al.getName());
	}

	@Test
	public void testSetName() {
		name = " pAco Rabane ";
		al.setName(name);
		assertEquals("paco rabane", al.getName());
	}

	@Test
	public void testGetFat() {
		assertEquals(fat, al.getFat(), fuzzy);
	}

	@Test
	public void testSetFat() {
		fat = ToolBox.getRandomDouble(minVal,maxVal);
		al.setFat(fat);
		assertEquals(fat, al.getFat(), fuzzy);
	}

	@Test
	public void testGetSatfat() {
		assertEquals(satfat, al.getSatfat());
	}

	@Test
	public void testSetSatfat() {
		satfat = ToolBox.getRandomDouble(minVal,maxVal);
		al.setSatfat(satfat);
		assertEquals(satfat, al.getSatfat(), fuzzy);
	}

	@Test
	public void testGetHc() {
		assertEquals(hc, al.getHc());
	}

	@Test
	public void testSetHc() {
		hc = ToolBox.getRandomDouble(minVal,maxVal);
		al.setHc(hc);
		assertEquals(hc, al.getHc(), fuzzy);
	}

	@Test
	public void testGetSugar() {
		assertEquals(sugar, al.getSugar(), fuzzy);
	}

	@Test
	public void testSetSugar() {
		sugar = ToolBox.getRandomDouble(minVal,maxVal);
		al.setSugar(sugar);
		assertEquals(sugar, al.getSugar(), fuzzy);
	}

	@Test
	public void testGetProtein() {
		assertEquals(protein, al.getProtein(), fuzzy);
	}

	@Test
	public void testSetProtein() {
		protein = ToolBox.getRandomDouble(minVal,maxVal);
		al.setProtein(protein);
		assertEquals(protein, al.getProtein(), fuzzy);
	}

	@Test
	public void testGetSalt() {
		assertEquals(salt, al.getSalt(), fuzzy);
	}

	@Test
	public void testSetSalt() {
		salt = ToolBox.getRandomDouble(minVal,maxVal);
		al.setSalt(salt);
		assertEquals(salt, al.getSalt(), fuzzy);
	}

}
