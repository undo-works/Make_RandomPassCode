package random;

public class Adjust_Digit {
	public static String adjustFour(int num) {
		String result;
		
		if(num < 10) {
			result = "000" + Integer.toString(num);
		}else if(num < 100) {
			result = "00" + Integer.toString(num);
		}else if(num < 1000) {
			result = "0" + Integer.toString(num);
		}else {
			result = Integer.toString(num);
		}
		
		return result;
	}
}
