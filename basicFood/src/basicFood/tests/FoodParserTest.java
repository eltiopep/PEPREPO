package basicFood.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import basicFood.outils.*;

public class FoodParserTest {
	String path = "C:\\programacio\\repositori\\PEPREPO\\basicFood\\auxFiles\\calories pep.csv";
	String foodName = "llet soja UHT";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParseFoodFromText() {
		HashMap<String, Aliment> foodMap = FoodParser.parseFoodFromText(path);
		foodName = foodName.toLowerCase();
		assertNotNull(foodMap.get(foodName));
	}

	@Test
	public void testWriteAlimentMapInTxt() {
		HashMap<String, Aliment> foodMap = FoodParser.parseFoodFromText(path);
		FoodParser.writeAlimentMapInTxt(foodMap, (path + "bis"));
		
	}

}
