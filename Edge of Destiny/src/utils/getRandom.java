package utils;

import java.util.Random;

public class getRandom {
	int minInt;
	int maxInt;
		
	public getRandom(int a, int b) {
		minInt = a;
		maxInt = b;
	}

	
	public int getIntRandom(){
		Random rand = new Random();
		int res = rand.nextInt(maxInt - minInt + 1) + minInt;
		return res;
	}
}
