package basicFood.outils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class foodParser {
	private static  String tab="	";

	public static HashMap<String, Aliment> parseFoodFromText(String entirePath) {
		HashMap<String, Aliment> alimentMap = new HashMap<String, Aliment>();
		String separator = tab;
		String line;
		BufferedReader in;
		try {
			int lineCounter = 0;
			in = new BufferedReader(new FileReader(entirePath));
			line = in.readLine();

			while (line != null) {
				System.out.println(line);
				line = in.readLine();
				lineCounter++;
				if (lineCounter > 1) {
					Aliment aliment = GenerateAlimentFromLine(line, separator);
					alimentMap.put(aliment.getName(), aliment);
				}
			}
		} catch (IOException e) {
		}
		return  alimentMap;
	}
	
	public static void writeAlimentMapInTxt(HashMap<String, Aliment> mapAliment, String fullPathTxt) {
//		TODO
		
	}

	private static Aliment GenerateAlimentFromLine(String line, String separator) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(line.split(separator + "[ ]*"));
		String name = list.get(0);
		Double kcal=  Double.valueOf(list.get(1).replace(",","."));
		Double fat = Double.valueOf(list.get(5).replace(",","."));
		Double satfat = Double.valueOf(list.get(6).replace(",","."));
		Double hc = Double.valueOf(list.get(2).replace(",","."));
		Double sugar = Double.valueOf(list.get(3).replace(",","."));
		Double protein = Double.valueOf(list.get(4).replace(",","."));
		Double salt = Double.valueOf(list.get(8).replace(",","."));
		Double weight = Double.valueOf(list.get(8).replace(",","."));
		//TODO READ SALT AND SODIUM AND STORE AS SALT, BUT CODE GETSODIUM AND SETSODIUM
		// String name, Double fat, Double satfat, Double hc, Double sugar, Double
		// protein, Double salt,Double weight
		Aliment aliment =   new Aliment(name, kcal, fat, satfat, hc, sugar, protein, salt, weight);
		return aliment;
	}
	
	TODO; OVERRIDE GENERATE ALIMENT FROM LINE TO MATCH MULTIPLE VALUES.
}
