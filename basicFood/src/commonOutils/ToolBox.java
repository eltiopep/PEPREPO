package commonOutils;

public class ToolBox {
	public static boolean doubleAlmostEqual(double a, double b, double fuzzy){
	    return Math.abs(a-b)<fuzzy;
	}
	public static boolean doubleAlmostEqual(double a, double b){
		return doubleAlmostEqual(a, b, 0.000001);
	}

}
		