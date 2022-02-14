package random;

import java.util.Random;

public class Execute_Random {

	public static void main(String[] args) {
		for(int num=0; num<=20; num++) {
			Random random = new Random();
			int randomValue = random.nextInt(10000);
			
			String passCode = Adjust_Digit.adjustFour(randomValue);
			
			System.out.println(passCode);
		}
		
	}

}
