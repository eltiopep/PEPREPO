package basicFood.outils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
				lineCounter++;
//				if (lineCounter == 104) {
//					System.out.println("ara peta");
//				}
				if (lineCounter > 1) {
					Aliment aliment = GenerateAlimentFromLine(line, separator);
					alimentMap.put(aliment.getName(), aliment);
					System.out.println(aliment.toString());
				}
				
				line = in.readLine();
			}
		} catch (IOException e) {
		}
		return alimentMap;
	}
	
	public static void writeAlimentMapInTxt(HashMap<String, Aliment> mapAliment, String fullPathTxt) {
		si existe, append, si no , crear
		try {
			FileWriter fw = new FileWriter(fullPathTxt, true);
			String lineSeparator = System.getProperty("line.separator");
			Iterator<Entry<String, Aliment>> it = mapAliment.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Aliment> pair = it.next();
				fw.write(pair.getValue().toStringOnlyValues() + lineSeparator);
			}
			fw.close();
		} catch (IOException e) {
		}

	}

	private static Aliment GenerateAlimentFromLine(String line, String separator) {
		// TODO Auto-generated method stub
		Double salt, fiber,satfat,fat,protein,sugar,hc,kcal;
		String name="";
		salt = fiber = satfat = fat = protein = sugar = hc = kcal=0.0;
		List<String> list = Arrays.asList(line.split(separator + "[ ]*"));
		int i=list.size()-1;
		switch (i){
		case 8:
			 salt = emptyToZeros(list.get(8));
		case 7:
			 fiber = emptyToZeros(list.get(7));
		case 6:
			 satfat = emptyToZeros(list.get(6));
		case 5:
			 fat = emptyToZeros(list.get(5));
		case 4:
			 protein = emptyToZeros(list.get(4));
		case 3:
			 sugar = emptyToZeros(list.get(3));
		case 2:
			 hc = emptyToZeros(list.get(2));
		case 1:
			 kcal=  emptyToZeros(list.get(1));
		case 0:
			name = list.get(0);
			Double weight = 100.0;
			//TODO READ SALT AND SODIUM AND STORE AS SALT, BUT CODE GETSODIUM AND SETSODIUM
			// String name, Double fat, Double satfat, Double hc, Double sugar, Double
			// protein, Double salt,Double weight
			Aliment aliment =   new Aliment(name, kcal, fat, satfat, hc, sugar, protein, salt,fiber, weight);
			return aliment;
		default:
			return null;
		}
	}
	
	static Double emptyToZeros (String stringToValidate) {
		if (stringToValidate.isEmpty() || stringToValidate.equals(null)){
			return(0.0);
		}
		else {
			return Double.valueOf(stringToValidate.replace(",","."));
		}
		
	}

}
