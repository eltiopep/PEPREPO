package commonOutils;

import java.util.Random;

public class ToolBox {
	public static boolean doubleAlmostEqual(double a, double b, double fuzzy){
	    return Math.abs(a-b)<fuzzy;
	}
	public static boolean doubleAlmostEqual(double a, double b){
		return doubleAlmostEqual(a, b, 0.000001);
	}

	public static Double getRandomDouble() {
		Random r = new Random();
		return r.nextDouble();
	}
	public static Double getRandomDouble(int minValue, int maxValue) {
		Random r = new Random();
		return minValue + (maxValue-minValue)*r.nextDouble();
	}
	
	//returns 0.0 if an Double is null
	public static Double verifyDouble(Double number) {
		if(  number != null) {
			return number;
		}
		else {
			return 0.0;
		}
			
	}
}
		